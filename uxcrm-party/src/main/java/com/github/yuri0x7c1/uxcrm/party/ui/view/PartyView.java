package com.github.yuri0x7c1.uxcrm.party.ui.view;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.apache.ofbiz.party.party.CreatePartyGroupService;
import org.apache.ofbiz.party.party.Party;
import org.apache.ofbiz.party.party.PartyGroup;
import org.apache.ofbiz.party.party.Person;
import org.apache.ofbiz.party.party.service.PartyService;
import org.apache.ofbiz.party.party.ui.form.CreatePartyGroupServiceForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.spring.sidebar.annotation.SideBarItem;
import org.vaadin.spring.sidebar.annotation.VaadinFontIcon;
import org.vaadin.viritin.LazyList;
import org.vaadin.viritin.button.MButton;
import org.vaadin.viritinv7.fields.MTable;

import com.github.yuri0x7c1.uxcrm.common.ui.view.CommonView;
import com.github.yuri0x7c1.uxcrm.party.ui.menu.category.PartyCategories;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.themes.ValoTheme;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@VaadinFontIcon(VaadinIcons.GROUP)
@SideBarItem(sectionId=PartyCategories.PARTY, caption=PartyView.NAME, order = 1)
@UIScope
@SpringView(name =  PartyView.NAME)
public class PartyView extends CommonView implements View {

	public static final String NAME = "Parties";

	public static final String PARTY_TYPE_ID_PARTY_GROUP = "PARTY_GROUP";

	public static final String PARTY_TYPE_ID_PERSON = "PERSON";

	@Autowired
	private PartyService partyService;
		
	private final MButton createPartyGroupButton = new MButton("Create Party Group")
			.withIcon(VaadinIcons.GROUP)
			.withStyleName(ValoTheme.BUTTON_PRIMARY);
	
	private final MButton createPersonButton = new MButton("Create Person")
			.withIcon(VaadinIcons.USER)
			.withStyleName(ValoTheme.BUTTON_PRIMARY);

	private MTable<Party> partyTable = new MTable<>(Party.class)
		.withProperties("partyId")
		.withFullWidth()
		.withFullHeight();

	public PartyView() {
		setHeaderText(NAME);
		setHeight(100, Unit.PERCENTAGE);
		
		addHeaderComponent(createPartyGroupButton);
		addHeaderComponent(createPersonButton);
		
		addComponent(partyTable);
		setExpandRatio(partyTable, 1.0f);
	}

	@PostConstruct
    public void init() throws Exception {
		// initialize create party group button
		createPartyGroupButton.withListener(event -> {
			getUI().getNavigator().navigateTo(CreatePartyGroupView.NAME);
		});
		
		// load parties
		partyTable.lazyLoadFrom(
			(firstRow, sortAscending, property) -> {
				List<Party> parties = partyService.find(
						Integer.valueOf(firstRow),
						Integer.valueOf(LazyList.DEFAULT_PAGE_SIZE),
						property != null ? Collections.singletonList(property + " " + (sortAscending ? "ASC" : "DESC")) : null,
						null);

				return parties;
			},
			() -> {
				return partyService.count(null);
			}
		)
		.withGeneratedColumn("Party Name", party -> {
			if (PARTY_TYPE_ID_PARTY_GROUP.equals(party.getPartyTypeId())) {
				Optional<PartyGroup> partyGroup = partyService.getPartyGroup(party);
				if (partyGroup.isPresent()) {
					return partyGroup.get().getGroupName();
				}
			}
			else if (PARTY_TYPE_ID_PERSON.equals(party.getPartyTypeId())) {
				Optional<Person> person = partyService.getPerson(party);
				if (person.isPresent()) {
					return person.get().getFirstName() + " " + person.get().getLastName();
				}
			}
			return "";
		})
		.sort(new Object[] {"partyId"}, new boolean[] {true});
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    }
}
