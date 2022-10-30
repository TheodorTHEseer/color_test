package com.company;

import com.company.commands.Command;

public class Main {

        public static void main(String[] args) {
        Command command = new Command(args);
        command.run();
        }
}
