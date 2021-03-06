package com.github.yuri0x7c1.uxcrm.devtools.config;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.collections4.map.UnmodifiableMap;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.model.ModelEntity;
import org.apache.ofbiz.entity.model.ModelReader;
import org.apache.ofbiz.service.LocalDispatcher;
import org.apache.ofbiz.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.yuri0x7c1.uxcrm.devtools.entity.generator.EntityGenerator;
import com.github.yuri0x7c1.uxcrm.devtools.service.generator.ServiceGenerator;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class DevtoolsConfiguration {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	Delegator delegator;

	@Autowired
	LocalDispatcher dispatcher;

	@RequiredArgsConstructor
	public static class ModelOfbiz {

		@NonNull
		Map<String, ModelEntity> entities;

		@NonNull
		Map<String, ModelService> services;

		public Map<String, ModelEntity> getEntities() {
			return UnmodifiableMap.unmodifiableMap(entities);
		}

		public Map<String, ModelService> getServices() {
			return UnmodifiableMap.unmodifiableMap(services);
		}

	}

	@Bean
	public ModelOfbiz modelOfbiz() throws Exception {

		// get all entities
		ModelReader modelReader = delegator.getModelReader();
		Map<String, ModelEntity> entities = new TreeMap<>();
		Set<String> entityNames = modelReader.getEntityNames();
		for (String entityName : entityNames) {
			entities.put(entityName, modelReader.getModelEntity(entityName));
		}

		// get all services
		Map<String, ModelService> services = new TreeMap<>();
		for (String serviceName : dispatcher.getDispatchContext().getAllServiceNames()) {
			services.put(serviceName, dispatcher.getDispatchContext().getModelService(serviceName));
		}

		ModelOfbiz modelOfbiz = new ModelOfbiz(entities, services);
		return modelOfbiz;
	}

	@Bean
	public Map<String, EntityGenerator> entityGenerators() {
		Map<String, EntityGenerator> entityGenerators = new HashMap<>();
		for (EntityGenerator entityGenerator : applicationContext.getBeansOfType(EntityGenerator.class).values()) {
			entityGenerators.put(entityGenerator.getName(), entityGenerator);
		}
		log.debug("!!! Available entity generators : {}", entityGenerators);
		return entityGenerators;
	}

	@Bean
	public Map<String, ServiceGenerator> serviceGenerators() {
		Map<String, ServiceGenerator> serviceGenerators = new HashMap<>();
		for (ServiceGenerator serviceGenerator : applicationContext.getBeansOfType(ServiceGenerator.class).values()) {
			serviceGenerators.put(serviceGenerator.getName(), serviceGenerator);
		}
		log.debug("!!! Available service generators : {}", serviceGenerators);
		return serviceGenerators;
	}
}
