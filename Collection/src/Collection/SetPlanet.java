package Collection;
import java.util.*;

public class SetPlanet {
    public static void main(String[] args) {
        // menggunakan HashSet
        Set<String> planets = new HashSet<>();
        planets.add("mercury"); //method add() untuk menambahkan objek ke Set
        planets.add("venus");
        planets.add("earth");
        planets.add("earth");
        planets.add("earth"); // menambahkan objek "earth" beberapa kali
        planets.add("mars"); //objek bisa terus bertambah ke Set

        // methot size() untuk mendapatkan ukuran Set
        System.out.println("Set palnets awal: (size = " + planets.size() + ")");
        for(String planet : planets){
            System.out.println("\t " + planet);
        }

        planets.remove("venus"); // method remove() untuk mengeluarkan Objek dari Set
        System.out.println("Set planets Akhir: (size = " + planets.size() + ")");
        for(Iterator iterator = planets.iterator(); iterator.hasNext(); ){
            //looping mengunakan iterator
            System.out.println("\t " +iterator.next());
        }
    }
}
