package com.exception;

public class NumberFormat_Demo {// Java program to demonstrate NumberFormatException
    public static void main(String args[])
    {
        //excaption
//        int num = Integer.parseInt ("tes bos qu") ;
//        System.out.println(num);

        //excaption headling
        try {
            // "akki" is not a number
            int num = Integer.parseInt ("tes bos qu") ;

            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }
}


