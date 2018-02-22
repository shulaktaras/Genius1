package Practic3;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Car toyota = new Car("Toyota", 2005, 1234,
                new Engine("tayota", 2, 400),
                new Girandole("toyota", 43));
        Car lada = new Car("lada", 2000, 2345,
                new Engine("lada", 3, 250),
                new Girandole("lada", 40));
        TreeSet<Car> cars = new TreeSet<>();
        cars.add(toyota);
        cars.add(lada);
//        System.out.println(cars);
        Iterator<Car> carIterator = cars.iterator();
        while (carIterator.hasNext()){
            Car next = carIterator.next();
            if (next.age > 1000){
                 next.girandole.diametr =next.girandole.diametr - 30;
            }
            System.out.println(next);
        }

    }
}
