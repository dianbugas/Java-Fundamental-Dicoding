package com.array;

public class Loopingarray {
    public static void main(String []args){
        int [] arrInt = new int[100];

        //====inisialisai menampilkan dari 1 - 100
        for(int x=0; x < arrInt.length; x++){
            arrInt[x] = x+1;
            System.out.println(arrInt[x]);
        }

        String str = "91204";
        str += 23;
        System.out.print(str);

        int x = 5;
        if (x > 6) System.out.println("x>i");
        else if (x >= 5)
            System.out.println("x>=5");
        else if (x < 10)
            System.out.println("x<10");
        else
            System.out.println("bukan dari salah satu di atas");
    }
}
