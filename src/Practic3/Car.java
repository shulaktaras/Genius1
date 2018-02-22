package Practic3;

public class Car implements Comparable<Car>{
    String model;
    int age;
    int number;

    Engine engine = new Engine();
    Girandole girandole = new Girandole();

    public Car() {
    }

    public Car(String model, int age, int number, Engine engine, Girandole girandole) {
        this.model = model;
        this.age = age;
        this.number = number;
        this.engine = engine;
        this.girandole = girandole;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", age=" + age +
                ", number=" + number +
                ", engine=" + engine +
                ", girandole=" + girandole +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.age - o.age;
    }
}
