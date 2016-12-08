package com.example.java;

import com.example.java.model.Olive;

import java.util.List;

/**
 * Created by george156200911 on 1/12/2016.
 */
public class OlivePress {

    public int getOil(List<Olive> olives){
        for (Olive o:olives){
            System.out.println(o.name);
        }
        return 0;
    }
}
