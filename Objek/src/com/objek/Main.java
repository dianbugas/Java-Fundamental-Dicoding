package com.objek;

public class Main {
    public static void main(String []args){
//        //menciptakan objek dengan nama 'objek hewan'
//        Hewan objekHewan = new Hewan();
//        Hewan objekWarna = new Hewan();
//        objekHewan.cetakNama("elang");
//        objekWarna.cetakWarna("BIRU");
            Hewan Elang = new Hewan("Elang");
            Hewan Kucing = new Hewan("Kucing");
            Elang.beratHewan(5);
            Elang.jumlahKakiHewan(2);
            Elang.cetakHewan();
            Kucing.beratHewan(2);
            Kucing.jumlahKakiHewan(4);
            Kucing.cetakHewan();
    }
}
