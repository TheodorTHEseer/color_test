package com.company;

import com.company.functoins.Paint;

import java.util.Arrays;

public class Main {

        public static void main(String[] args) {

            for (String str:args
                 ) {
                switch (str.toLowerCase()){
                    case "--paint":paint(args);
                    case "--server":server(args);
                    case "--text":server(args);
                }
            }

            for (int i=0; i<args.length; i+=2){
                Paint paint = new Paint(args[i], args[i+1]);
                paint.getResult();
            }
        }

        private static void paint(String[] strings){
            for (int i=0; i<strings.length; i+=2){
                String tag = strings[i];
                String option = strings[i+1];
                if (tag.equalsIgnoreCase("--server")||tag.equalsIgnoreCase("--text"))
                    break;
                Paint paint = new Paint(tag, option);
                paint.getResult();
            }
        }

        private static void server (String [] strings){//plug
            System.out.println(strings.toString()+" -server !started");
        }

        private static void text(String [] strings){//plug
            System.out.println(strings.toString()+" -was text");
        }
}
