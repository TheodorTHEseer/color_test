package com.company;

import com.company.functoins.Paint;

public class Main {

        public static void main(String[] args) {
                for (String str: args
                     ) {
                    Paint paint=new Paint(str);
                    System.out.printf(paint.getName()+"\n");
                }

        }
}
