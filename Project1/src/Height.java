public class Height {
    private final int feet;
    private final int inches;

    public Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public int toInches() {
        return (feet * 12) + inches;
    }

    @Override
    public String toString() {
        return this.feet + "'" + this.inches + "\"";
    }
}