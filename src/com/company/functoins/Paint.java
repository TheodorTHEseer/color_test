package com.company.functoins;

import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Locale;

public class Paint {
    private String name;

    private String color;

    private HashMap <String, String> hashMap = new HashMap<>(20);

    public Paint(String name, String color) {
        hashMap.put("square","■");
        hashMap.put("triangle","▲");
        hashMap.put("circle", "●");
        hashMap.put("red","\u001B[31m");
        hashMap.put("blue","\u001B[34m");
        hashMap.put("green","\u001B[32m");

        this.name=hashMap.get(name);
        this.color=hashMap.get(color);
    }

    public void getResult(){
        System.out.println(color+name);
    }
}
