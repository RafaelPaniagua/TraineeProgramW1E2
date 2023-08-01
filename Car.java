public class Car extends Vehicle {

    public Car(String type, int wheel, int velocity, int numSeats) {
        super(type, wheel, velocity);
        this.numSeats = numSeats;
    }

    private int numSeats;

    public Car() {
    }

    public Car(String type, String maker, String model, int year, int wheel, int velocity, int numSeats) {
        super(type, maker, model, year, wheel, velocity);
        this.numSeats = numSeats;
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void breaking() {

    }



}
