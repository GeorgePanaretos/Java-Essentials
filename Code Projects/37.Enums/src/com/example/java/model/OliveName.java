package com.example.java.model;

/**
 * Created by george156200911 on 2/12/2016.
 */
public enum OliveName {
    KALAMATA("Kalamata"), LIGURIAN("Ligurian");

    private String name;

    OliveName(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return name;
    }
}
