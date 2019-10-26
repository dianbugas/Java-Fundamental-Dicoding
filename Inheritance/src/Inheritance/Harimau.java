package Inheritance;

public class Harimau extends Hewan {
    public Harimau(){
        //super();
        System.out.println("contructor Harimau");
    }

    public void makan() { // overriding
        System.out.println("Harimau sedang makan..");
    }

    public void makan(String food) { // overloading
        System.out.println("Harimau makan " + food);
    }
}
