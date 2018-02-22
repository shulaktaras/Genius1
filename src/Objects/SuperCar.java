package Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SuperCar extends Car {

    int passenger;

    public SuperCar(int mass, String color, int passenger) {
        super(mass, color);
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "SuperCar{" +
                "passenger=" + passenger +
                ", mass=" + mass +
                ", color='" + color + '\'' +
                '}';
    }
}
