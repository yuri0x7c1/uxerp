package com.github.yuri0x7c1.uxerp.ui;

import org.springframework.stereotype.Component;

import com.github.yuri0x7c1.uxerp.common.ui.menu.annotation.MenuCategories;
import com.github.yuri0x7c1.uxerp.common.ui.menu.annotation.MenuCategory;

@Component
@MenuCategories({
    @MenuCategory(id = Categories.COMMON, caption = "Common"),
})
public class Categories {
    public static final String COMMON = "common";
}