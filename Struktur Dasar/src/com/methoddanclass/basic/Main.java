package com.methoddanclass.basic;

import com.methoddanclass.basic.kendaraan.*;
import com.methoddanclass.basic.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String [] args){
        System.out.println("hello word");
        Gitar.bunyi();
        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today,1);
        System.out.println("besok = " + tomorrow);
    }
}
