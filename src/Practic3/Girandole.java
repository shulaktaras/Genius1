package Practic3;

public class Girandole {
    String vyrobnyk;
    int diametr;

    public Girandole() {
    }

    public Girandole(String vyrobnyk, int diametr) {
        this.vyrobnyk = vyrobnyk;
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        return "Girandole{" +
                "vyrobnyk='" + vyrobnyk + '\'' +
                ", diametr=" + diametr +
                '}';
    }
}
