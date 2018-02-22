package Collection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Number> numbers = new ArrayList<>();
//        numbers.add(7);
//        numbers.add(6);
//        numbers.add(4);
//        numbers.add(4);
//        System.out.println(numbers);

    ArrayList<Person> people = new ArrayList<>();
    Person alla = new Person("Alla", 25);
    Person taras = new Person("Taras", 34);
    Person ihor = new Person("Ihor", 34);

    people.add(alla);
    people.add(taras);
    people.add(ihor);

        for (Person person : people) {
            System.out.println(person);

        }
//        System.out.println(people);


    }
}
