package com.kurtz.creational.factory;

import com.kurtz.creational.factory.page.CartPage;
import com.kurtz.creational.factory.page.ItemPage;
import com.kurtz.creational.factory.page.SearchPage;

public class Shop extends Website {
    protected void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
