package Practic2;

public class Engine {
    String model;
    int bulk;
    int power;

    public Engine() {
    }

    public Engine(String model, int bulk, int power) {
        this.model = model;
        this.bulk = bulk;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", bulk=" + bulk +
                ", power=" + power +
                '}';
    }
}
