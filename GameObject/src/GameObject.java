public class GameObject {
    private String name;
    private double[] position;

    public GameObject(String name, double[] position)   {
        this.name = name;
        this.position = position.clone();
    }

    public String getName() {
        return name;
    }

    public double[] getPosition() {
        return position.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void draw()   {
        System.out.println(name + " is now visible on the screen");
    }

    public void erase() {
        System.out.println(name + " has disappeared from the screen.");
    }

    public static void main(String[] args) {
        // ✅ Create Wizard (initial health: 10)
        PlayerCharacter wizard = new PlayerCharacter("Wizard", new double[]{1.0, 2.0}, 10);

        // ✅ Create Orc (initial health: 5)
        PlayerCharacter orc = new PlayerCharacter("Orc", new double[]{3.0, 4.0}, 5);

        // ✅ Draw both characters on screen
        wizard.draw();
        orc.draw();

        // ✅ Wizard attacks Orc (Orc loses 5 health → Health reaches 0)
        wizard.attack(orc); // Orc should disappear
    }

}

class PlayerCharacter extends GameObject {
    private String name;
    private double[] position;
    private int health;

    public PlayerCharacter(String name, double[] position, int health) {
        super(name, position);
        position.clone();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double[] getPosition() {
        return position;
    }

    public void setPosition(double[] position) {
        this.position = position;
    }

    // ✅ Attack method (Reduces opponent's health by 5 points)
    public void attack(PlayerCharacter playerToAttack) {
        System.out.println(getName() + " attacks " + playerToAttack.getName() + "!");
        playerToAttack.setHealth(playerToAttack.getHealth() - 5);

        if (playerToAttack.getHealth() <= 0) {
            playerToAttack.erase(); // The character disappears if health reaches 0
        } else {
            System.out.println(playerToAttack.getName() + " now has " + playerToAttack.getHealth() + " health points.");
        }
    }
}

