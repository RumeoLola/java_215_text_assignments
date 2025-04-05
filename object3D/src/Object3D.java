public abstract class Object3D {
    // Attribute
    private String material;
    private String color;

    // Constructor
    protected Object3D(String material, String color) {
        this.material = material;
        this.color = color;
    }

    // Getters for private attributes
    String getMaterial() {
        return this.material;
    }

    String getColor() {
        return this.color;
    }

    // Abstract method to calculate the volume of the shape
    public abstract double calculateVolume();

    // Abstract method to calculate the surface area of the shape
    public abstract double calculateSurfaceArea();
}