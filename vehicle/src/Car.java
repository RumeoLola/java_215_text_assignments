public class Car extends Vehicle{
    private String make;

    public Car(String make, double maxSpeed, String color) {
        super(maxSpeed, color);
        this.make = make;
        this.setMaxSpeed();
    }

    @Override
    public double getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public String getMake() {
        return make;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public void setMaxSpeed(double maxSpeed) {
        super.setMaxSpeed();
    }

    public void setMake(String make) {
        this.make = make;
    }

    public static void main(String[] args) {
        Car car = new Car("BMW M2 Competition", 155.0, "black" );
        System.out.println("My " + car.getColor() + " " + car.make + " reaches a top speed of " + car.getMaxSpeed() + " mph.");
    }
}
