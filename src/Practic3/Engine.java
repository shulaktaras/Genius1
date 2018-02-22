package Practic3;

public class Engine {
    String model;
    int obem;
    int horsePower;

    public Engine() {
    }

    public Engine(String model, int obem, int horsePower) {
        this.model = model;
        this.obem = obem;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", obem=" + obem +
                ", horsePower=" + horsePower +
                '}';
    }
}
