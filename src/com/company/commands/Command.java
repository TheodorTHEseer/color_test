package com.company.commands;

import java.util.ArrayList;

public class Command implements Performing {

    private String tag;
    private String command;
    private ArrayList<String> commandList;

    @Override
    public ArrayList<String> getHelp(String tag) {
        return commandList;
    }
}
