package Abstract;

public class Horse extends Animal{
    int legs;

    public Horse() {
    }

    public Horse(boolean brain, int eyes, int legs) {
        super(brain, eyes);
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String  toString() {
        return "Horse{" +
                "legs=" + legs +
                "} " + super.toString();
    }

    @Override
    public void run() {
        System.out.println("run fast");
    }
}
