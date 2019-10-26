package Inheritance;

public class Main {
    public static void main(String []args){
        Hewan hewan = new Hewan(); // Memanggil contructor
        System.out.println("Apakah hewan IS-A Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing -> " + (hewan instanceof Kucing));
        System.out.println("Apakah hewan IS-A Harimau -> " + (hewan instanceof Harimau));

        System.out.println("--------------------");

        Kucing kucing = new Kucing(); //PEMANGGILAN contructor
        System.out.println("Apakah hewan IS-A Objek -> " + (kucing instanceof Object));
        System.out.println("Apakah kucing IS-A Hewan -> " + (kucing instanceof Hewan));
        System.out.println("Apakah kucing IS-A Kucing -> " + (kucing instanceof Kucing));

        System.out.println("--------------------");

        Harimau harimau = new Harimau();
        System.out.println("Apakah hewan IS-A Objek -> " + (harimau instanceof Object));
        System.out.println("Apakah kucing IS-A Hewan -> " + (harimau instanceof Hewan));
        System.out.println("Apakah hewan IS-A Harimau -> " + (harimau instanceof Harimau));

        System.out.println("------------------------");

        hewan.makan(); // kucing dan harimau mewarisi metode makan() dari parent class Hewan
        kucing.makan();
        kucing.makan("daging ikan");
    }
}
