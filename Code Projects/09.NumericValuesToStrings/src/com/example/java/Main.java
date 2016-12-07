package com.example.java;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        int intValue = 42;
        String frontInt= Integer.toString(intValue);
        System.out.println(frontInt);

        boolean boolValue = true;
        String frontBool=Boolean.toString(boolValue);
        System.out.println(frontBool);

        long longValue = 10_000_000;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String frontLong= formatter.format(longValue);
        System.out.println(frontLong);

    }

}
