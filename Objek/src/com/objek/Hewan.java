package com.objek;

public class Hewan {
//    public void cetakNama(String nama){
//        System.out.println("Nama hewan : " + nama);
//    }
//    public void cetakWarna(String warna){
//        System.out.println("Warna hewan : " + warna);
//    }
String nama;
    int berat;
    int jumlahKaki;
    // Ini merupakan konstruktor dari kelas hewan. konstruktor adalah method yang pertama kali dijalankan ketika object diciptakan.
    public Hewan(String namaHewan) {
        nama = namaHewan;
    }
    public void beratHewan(int beratHewan) {
        berat = beratHewan;
    }
    public void jumlahKakiHewan(int jumlahKakiHewan) {
        jumlahKaki = jumlahKakiHewan;
    }

    public void cetakHewan() {
        System.out.println("Nama hewan : " + nama);
        System.out.println("Berat hewan : " + berat + " kg");
        System.out.println("Jumlah kaki: " + jumlahKaki);
    }
}
