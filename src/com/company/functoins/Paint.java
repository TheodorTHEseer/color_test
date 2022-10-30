package com.company.functoins;

import java.util.IllegalFormatException;
import java.util.Locale;

public class Paint {
    private String name;
    private String square="■";
    private String triangle="▲";
    private String circle ="●";


    public Paint(String name) {
        switch (name){
            case "square": name=square;
            break;
            case "triangle": name=triangle;
            break;
            case "circle": name = circle;
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + name);
        }
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
