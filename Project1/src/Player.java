public class Player {
    private final int age;
    private final Height height;
    private final String name;

    public Player(String name, Height height, int age) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public Height height(Height height) {
            return height;
    }

    public Height getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age + height;
    }

    public String getName() {
        return name;
    }
}