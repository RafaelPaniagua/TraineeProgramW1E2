public class MotorCycle extends  Vehicle {

    int cylinder;

    public MotorCycle() {
    }

    public MotorCycle(String type, String maker, String model, int year, int wheel, int velocity, int cylinder) {
        super(type, maker, model, year, wheel, velocity);
        this.cylinder = cylinder;
    }

    public MotorCycle(String type, int wheel, int velocity, int cylinder) {
        super(type, wheel, velocity);
        this.cylinder = cylinder;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void breaking() {

    }
}
