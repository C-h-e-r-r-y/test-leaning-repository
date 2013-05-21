package com.git_training;

import java.util.Collection;

public class AppRunner {
    public static void main (String[] args) {
        Collection<Publisher> data = PublisherFactory.getInstance().createCollection(3);
        for (Publisher p : data) {
            System.out.println(p);
        }
    }
}
