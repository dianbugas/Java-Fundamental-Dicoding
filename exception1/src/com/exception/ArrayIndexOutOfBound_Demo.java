package com.exception;

public class ArrayIndexOutOfBound_Demo {
    // Java program to demonstrate ArrayIndexOutOfBoundException
    public static void main(String args[])
    {
        //excaption
//        int a[] = new int[5];
//        a[6] = 9; // accessing 7th element in an array of
        // size 5

        //excaption headling
        try{
            int a[] = new int[5];
            a[6] = 9; // accessing 7th element in an array of
            // size 5
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }
    }
}