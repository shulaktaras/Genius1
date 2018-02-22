package Abstract;

public abstract class  Animal {
    private boolean brain;
    private int eyes;

    public Animal(){
    }
    public Animal(boolean brain, int eyes){
        this.brain =  brain;
        this.eyes = eyes;
    }
    public boolean getBrain(){
        return brain;
    }
    public void setBrain(boolean brain){
        this.brain = brain;
    }
    public int getEyes(){
        return eyes;
    }
    public void setEyes(int eyes ){
        this.eyes = eyes;
    }
    @Override
    public String toString(){
        return this.eyes + " " + this.brain;
    }

    public abstract void run();
}
