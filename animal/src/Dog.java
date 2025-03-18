public class Dog extends Animal{
    private final String name;
    private int age = 12;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public String bark()    {
        return "Woof!";
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Max", 4);
        System.out.println(dog.bark());
        System.out.println("My dog " + dog.name + " is " + dog.age + " years old today");
    }
}
