package Practic2;

import jdk.nashorn.api.tree.Tree;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Car toyota = new Car("Toyota", 1999,2134,
                new Engine("toyota", 3,400) ,
                new Girandole("toyota",40) );
        Car bmw = new Car("bmw", 2012,2454,
                new Engine("bmw", 3,450) ,
                new Girandole("bmw",30) );

        TreeSet<Car> cars = new TreeSet<>();
        cars.add(toyota);
        cars.add(bmw);
//        System.out.println(cars);


        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car next = iterator.next();
            if (next.year < 2000){
                next.girandole.diametr = next.girandole.diametr -1;
            }

                System.out.println(next);
        }

    }
}
