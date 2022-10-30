package com.company;

import com.company.functoins.Paint;

public class Main {

        public static void main(String[] args) {

            for (int i=0; i<args.length; i+=2){
                Paint paint = new Paint(args[i], args[i+1]);
                paint.getResult();
            }
        }
}
