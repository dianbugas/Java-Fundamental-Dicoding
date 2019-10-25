package com.exception;

public class NullPointer_Demo {
    public static void main(String args[])
    {
        //exception
//            String a = null; //null value
//            System.out.println(a.charAt(0));

        //exception hendling
        try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("NullPointerException..");
        }
    }
}
