public abstract class Appliance {
    private int powerRating;
    protected boolean isOn;

    public Appliance(int powerRating, boolean isOn) {
        this.powerRating = powerRating;
        this.isOn = isOn;
    }

    public abstract void turnOn();
    abstract public void turnOff();

    public boolean isOperating()    {
        return isOn;
    }

    public int getPowerRating() {
        return powerRating;
    }
}
