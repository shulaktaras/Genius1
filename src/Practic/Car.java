package Practic;

public class Car {
    int volumeEngine;

    public Car(){
    }

    public Car(int volumeEngine){
        this.volumeEngine = volumeEngine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "volumeEngine=" + volumeEngine +
                '}';
    }
}
