package com.company;

public class Main {

        public static void main(String[] args) {
            System.out.printf("\u001b[31mR \u001b[32mG \u001b[34mB \u001b[0mreset \u001b[37mwhite \u001b[30mblack");
            System.out.printf("\n\u001b[0mR G B reset white black");

            //DELETE THIS
            if(args.length>0){
                for (int i=0; i < args.length; i++)
                    System.out.printf(args[i]+"\n");
            }
        }
}
