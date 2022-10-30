package com.company.commands;

import java.util.ArrayList;

public class Command implements Performing {

    private String tag;
    private String [] command;
    private ArrayList<String> optionsList = new ArrayList<>(100);

    public Command(String [] command) {
        this.command=command;
    }

    private void execute(){
        optionsList.add("TEST");//TODO DELETE THIS
        for(int i = 0; i<command.length; i++){
            switch (command[i]){
                case "--help":
                    System.out.printf(getHelp(command[i]).toString());//TODO CHANGE THIS
            }
        }
    }

    @Override
    public void run(){
        execute();
        System.out.printf("Сделал");
    }

    @Override
    public ArrayList<String> getHelp(String tag) {
        return optionsList;
    }
}
