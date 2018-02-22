package Abstract;

public class Main {
    public static void main(String[] args) {
        Animal animal[] = {new Horse(), new Bird()};
        test(new Horse( ));
    }

    public static void test(Animal animal){
        animal.run();
    }
}
