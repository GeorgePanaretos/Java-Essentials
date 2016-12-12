package com.example.java;

import com.example.java.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * This is an <b>olive press</b> application, and it's job is to <i> press Olives</i>
 */
public class Main {
    /**
     *
     * @param args
     */

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);

        System.out.println("You got " + totalOil + " units of oil");

    }

}
