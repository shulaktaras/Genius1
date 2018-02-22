package Collection.Hw;

public class Deputy implements Comparable<Deputy> {
    String name;
    int age;
    int money;

    public Deputy(String name, int age, int money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }

    @Override
    public int compareTo(Deputy o) {
        return this.age - o.age;
    }
}
