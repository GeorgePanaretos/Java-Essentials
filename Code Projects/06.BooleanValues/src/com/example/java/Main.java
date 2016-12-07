package com.example.java;

public class Main {

    static boolean bDef;

    public static void main(String[] args) {
        boolean b1=true;
        boolean b2=false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(bDef);

        boolean b3 =!b1;
        System.out.println(b3);

        int il=0;
        boolean b4 =(il != 0);
        System.out.println(b4);

        String sBoolean="true";
        boolean parsed= Boolean.parseBoolean(sBoolean);
        System.out.println(parsed);

    }

}
