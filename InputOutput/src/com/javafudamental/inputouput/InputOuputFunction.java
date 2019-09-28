package com.javafudamental.inputouput;

import java.util.Scanner;

public class InputOuputFunction {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan yang sangat sederhana");
        System.out.print("masukkan angka pertama");
        int value1 = scanner.nextInt();
        System.out.print("masukkan angka ke dua");
        int value2 = scanner.nextInt();
        int hasil = value1 + value2;
        System.out.println("hasilnya adalah " + hasil);
    }
}
