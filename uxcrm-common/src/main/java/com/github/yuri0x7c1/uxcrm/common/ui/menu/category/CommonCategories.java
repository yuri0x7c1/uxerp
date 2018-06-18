package com.github.yuri0x7c1.uxcrm.common.ui.menu.category;

import org.springframework.stereotype.Component;

import com.github.yuri0x7c1.uxcrm.common.ui.menu.annotation.MenuItem;
import com.github.yuri0x7c1.uxcrm.common.ui.menu.annotation.MenuItems;

@Component
@MenuItems({
    @MenuItem(id = CommonCategories.COMMON, caption = "Common", category = true, order=100),
})
public class CommonCategories {
	public static final String ROOT = "root";
    public static final String COMMON = "common";
}