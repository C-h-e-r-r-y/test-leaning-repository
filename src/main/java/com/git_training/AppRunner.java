package com.git_training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AppRunner {
    public static void main (String[] args) {
        Collection<Publisher> data = PublisherFactory.getInstance().createCollection(3);
        for (Publisher p : data) {
            System.out.println(p);
        }
        List<Compositor> compositors = new ArrayList<Compositor>();
        Compositor compositor = new Compositor();
        compositor.setSong("new song");
        compositors.add(compositor);
        for (Compositor c : compositors) {
            System.out.println(c);
        }

    }
}
