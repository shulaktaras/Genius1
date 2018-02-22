package Practic;

public class Popeluowka {

    String name;
    int age;
    int sizeLeg;

    public Popeluowka(String name, int age, int sizeLeg) {
        this.name = name;
        this.age = age;
        this.sizeLeg = sizeLeg;
    }

    @Override
    public String toString() {
        return "Popeluowka{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sizeLeg=" + sizeLeg +
                '}';
    }
}
