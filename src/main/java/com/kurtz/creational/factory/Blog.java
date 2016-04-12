package com.kurtz.creational.factory;

import com.kurtz.creational.factory.page.AboutPage;
import com.kurtz.creational.factory.page.CommentPage;
import com.kurtz.creational.factory.page.ContactPage;
import com.kurtz.creational.factory.page.PostPage;

public class Blog extends Website {
    protected void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
