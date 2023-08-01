public class Bicycle extends Vehicle {
    public Bicycle(String type, int wheel, int velocity, int pedalCadence) {
        super(type, wheel, velocity);
        this.pedalCadence = pedalCadence;
    }

    private int pedalCadence;


    public Bicycle() {
    }

    public Bicycle(String type, String maker, String model, int year, int wheel, int velocity, int pedalCadence) {
        super(type, maker, model, year, wheel, velocity);
        this.pedalCadence = pedalCadence;
    }



    public int getPedalCadence() {
        return pedalCadence;
    }

    public void setPedalCadence(int pedalCadence) {
        this.pedalCadence = pedalCadence;
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void breaking() {

    }


}
