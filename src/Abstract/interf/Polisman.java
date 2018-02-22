package Abstract.interf;

public class Polisman implements Runer, Singer {
    @Override
    public void sing() {
        System.out.println("ta ta ta ta");
    }

    @Override
    public int run() {
        return 100;
    }
}
