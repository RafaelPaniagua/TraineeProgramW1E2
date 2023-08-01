public abstract class Vehicle {


    private  String type;
    private String maker;

    private String model;

    private int year;

    private int wheel;
    private int velocity;

    public Vehicle(String type, int wheel, int velocity) {
        this.type = type;
        this.wheel = wheel;
        this.velocity = velocity;
    }

    public Vehicle() {
    }

    public Vehicle(String type, String maker, String model, int year, int wheel, int velocity) {
        this.type = type;
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.wheel = wheel;
        this.velocity = velocity;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWheel() {
        return wheel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public abstract void accelerate();
    public abstract void breaking();





}
