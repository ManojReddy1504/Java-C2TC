package com.company;

import java.util.Scanner;

public class Typeconv {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
//        float num=input.nextFloat();
//        System.out.println(num);

        //exp of type casting
//        int num=(int) (95.32434234);
//        System.out.println(num);

        //automatic type promotion in expression
//        int a=400;
//        byte b=(byte) (a);
//        System.out.println(b);

//        int num='v';
//        System.out.println(num);

        //type promotion ex

        byte b=32;
        char c='w';
        short s=1982;
        int i=134;
        double d=0.123;
        float f=3.23f;
        double result=((f*b)+(i/c)-(d*s));
        //o/p is float+int-double=final result in double
        System.out.println((f*b)+""(i/c)+""+(d*s));
        System.out.println(result);

    }
}
