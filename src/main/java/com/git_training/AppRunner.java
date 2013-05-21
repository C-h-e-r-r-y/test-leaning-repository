package com.git_training;

import java.util.ArrayList;
import java.util.List;

public class AppRunner {
    public static void main (String[] args) {
        List<Publisher> data = new ArrayList<Publisher>();
        Publisher publisher = new Publisher();
        publisher.setMessage("Hello");
        data.add(publisher);
        for (Publisher p : data) {
            System.out.println(p);
        }
    }
}
