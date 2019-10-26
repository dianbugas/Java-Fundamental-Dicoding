package com.accessmodifier.package3;

public class Perhitungan {
    public static int nilai = 0;

    protected static int getNilai(){
        return nilai;
    }

    Perhitungan() {
        nilai++;
    }
}
