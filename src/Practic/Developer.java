package Practic;

public class Developer {
    String name;
    String hobby;

    public Developer(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
