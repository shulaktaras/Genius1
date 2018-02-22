package Abstract.interf;

public class Lawyer implements Runer, Singer {
    @Override
    public void sing() {
        System.out.println("la la la la la");
    }

    @Override
    public int run() {
        return 200;
    }
}
