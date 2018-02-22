package Collection.Hw;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Party party = new Party();
        Deputy taras = new Deputy("taras", 20 , 200000);
        Deputy ruslan = new Deputy("ruslan", 21 , 300000);
        Deputy nazar = new Deputy("nazar", 18 , 400000);

        party.deputies.add(taras);
        party.deputies.add(ruslan);
        party.deputies.add(nazar);
        System.out.println(party);

    }
}
