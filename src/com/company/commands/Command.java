package com.company.commands;

import java.util.HashMap;

public class Command implements Performing {
    private HashMap<Tag, Option> tagOptionHashMap= new HashMap<>(10);

    @Override
    public String getHelp(String tag) {
        return null;
    }

    @Override
    public void run() {

    }
}
