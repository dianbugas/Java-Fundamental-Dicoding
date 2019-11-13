package com.exception;


import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            System.out.println("Akses elemen ke 5 :" + a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
        } finally {
            a[4] = 10;
            System.out.println("Nilai elemen terakhir: " + a[4]);
        }
    }

//    public static void main(String[] args) {
//        try {
//            // Mencoba membaca berkas latihan.txt
//            File file = new File("D://latihan.txt");
//            FileReader fr = new FileReader(file);
//            // Jika berhasil maka tampilkan pesan
//            System.out.println("Read file berhasil");
//        } catch (Exception e) {
//            // Jika terjadi kesalahan maka tampilkan pesan
//            System.out.println(e.getMessage());
//        }
//    }
}

