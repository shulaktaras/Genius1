package Practic2;

public class Girandole {
    String vurobnyk;
    int diametr;

    public Girandole() {
    }

    public Girandole(String vurobnyk, int diametr) {
        this.vurobnyk = vurobnyk;
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        return "Girandole{" +
                "vurobnyk='" + vurobnyk + '\'' +
                ", diametr=" + diametr +
                '}';
    }
}
