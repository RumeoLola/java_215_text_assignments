public abstract class Sphere extends Object3D{
    private double radius;

    public Sphere(String material, String color, double radius)    {
        super(material, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double volume()  {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
