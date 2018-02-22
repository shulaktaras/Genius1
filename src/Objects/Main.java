package Objects;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(1500,"black");
        car.setMass(999);
        System.out.println(car.getMass());
        System.out.println(car);

        SuperCar superCar = new SuperCar(300,"red", 5);
        System.out.println(superCar);
    }
}
