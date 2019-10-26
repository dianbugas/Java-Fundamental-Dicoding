package Inheritance;

public class Kucing extends Hewan{
    public Kucing(){
        //super(); //akan tetap memamnggil contrusc dari parant kelas
        System.out.println("contrucst kucing");
    }

    public void makan() { // overriding
        System.out.println("Kucing sedang makan..");
    }
    public void makan(String food) { // overloading
        System.out.println("Kucing makan " + food);
    }
}
