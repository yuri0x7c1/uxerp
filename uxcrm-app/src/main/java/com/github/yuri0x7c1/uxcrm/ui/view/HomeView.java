package com.github.yuri0x7c1.uxcrm.ui.view;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.spring.i18n.I18N;
import org.vaadin.spring.sidebar.annotation.SideBarItem;
import org.vaadin.spring.sidebar.annotation.VaadinFontIcon;

import com.github.yuri0x7c1.uxcrm.common.ui.menu.category.CommonCategories;
import com.github.yuri0x7c1.uxcrm.common.ui.view.CommonView;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;

@VaadinFontIcon(VaadinIcons.HOME)
@SideBarItem(sectionId=CommonCategories.COMMON, caption=HomeView.NAME)
@SpringView(name = HomeView.NAME)
public class HomeView extends CommonView implements View {

	@Autowired
	private I18N i18n;

	public static final String NAME = "Home";

	@PostConstruct
    public void init() {
		setHeaderText(i18n.get(NAME));
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    }
}
