package Practic;

public class ITevent {
    String name;
    String technology;
    String city;
    int price;

    public ITevent(){}

    public ITevent(String name, String technology, String city, int price) {
        this.name = name;
        this.technology = technology;
        this.city = city;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ITevent{" +
                "name='" + name + '\'' +
                ", technology='" + technology + '\'' +
                ", city='" + city + '\'' +
                ", price=" + price +
                '}';
    }
}
