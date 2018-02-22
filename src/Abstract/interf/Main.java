package Abstract.interf;

public class Main {
    public static void main(String[] args) {
        Runer runer[] = {new Lawyer() , new Polisman()};
        Singer singer [] = { new Lawyer() , new Polisman(), new Student()};

        test(new Polisman());

    }
    public static void test(Singer singer){
        singer.sing();
    }
}
