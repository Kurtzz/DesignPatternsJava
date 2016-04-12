package com.kurtz.structural.proxy;

public class Demo {
    public static void main(String[] args) {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());

        System.out.println(service.getTimeline("Kurtzz_"));
    }
}
