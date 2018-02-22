package Practic2;

public class Car implements Comparable<Car>{
    String model;
    int year;
    int number;

    Engine engine =  new Engine();
    Girandole girandole = new Girandole();


    public Car() {
    }
    public Car(String model, int year, int number, Engine engine, Girandole girandole) {
        this.model = model;
        this.year = year;
        this.number = number;
        this.engine = engine;
        this.girandole = girandole;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", number=" + number +
                ", engine=" + engine +
                ", girandole=" + girandole +
                '}';
    }



//    @Override
//    public int compareTo(Object o) {
//
//        Car o1 = (Car) o;
//        return this.year -o1.year;
//    }

    @Override
    public int compareTo(Car o) {
        return this.year - o.year;
    }
}
