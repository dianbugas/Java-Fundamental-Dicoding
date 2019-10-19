package com.uangzidni;

public class Penghasilan extends DariOrtu {
    //private hanya di lingkup satu file saja
    private int penghasilan;
    int tanggal = 1;
    int beli = 500000;
    int total = 0;

    public Penghasilan() {
        penghasilan = 700000;
    }

    public void info() {
        while (tanggal < 16) {
            if (tanggal == 1) {
                System.out.println("Zidni Mendapat Uang Setiap Awal Bulan Sebesar Rp. " + uang);
                System.out.println("Kemudian Zidni Membeli Baju Seharga Rp. " + beli);
                total = uang - beli;
                System.out.println("Sisa Uang Zidni Sebesar Rp. " + total);
                System.out.println();
            } else if (tanggal == 15) {
                System.out.println("Zidni Mendapat Uang Tambahan Setiap Tanggal 15 Sebesar Rp" + penghasilan);
                total += penghasilan;
                System.out.println("Total Uang Zidni Sebesar Rp" + total);
            }
            System.out.println("Total Uang Zidni Tanggal " + tanggal + " Sebesar Rp" + total);
            tanggal++;
        }
    }
}
