package com.git_training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PublisherFactory {
    private static PublisherFactory instance = new PublisherFactory();

    public static PublisherFactory getInstance () {
        return instance;
    }

    private PublisherFactory () {
    }

    public Collection<Publisher> createCollection (int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Size can not be less than zero.");
        }
        List<Publisher> result = new ArrayList<Publisher>(size);
        for (int i = 0; i < size; size++) {
            Publisher publisher = new Publisher();
            publisher.setMessage("message " + i);
            result.add(publisher);
        }
        return result;
    }
}
