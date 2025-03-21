import java.util.ArrayList;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();

        while (true) {
            System.out.print("Enter player's name, age, height in feet, and height in inches (or press Enter to stop): ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                break; // Stop input if the user presses Enter
            }

            String[] parts = input.split(" ");
            if (parts.length != 4) {
                System.out.println("Invalid input. Please enter name, age, height in feet, and height in inches.");
                continue;
            }

            try {
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                int feet = Integer.parseInt(parts[2]);
                int inches = Integer.parseInt(parts[3]);

                Height height = new Height(feet, inches);
                Player player = new Player(name, height, age);
                players.add(player);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please enter valid integers for age, feet, and inches.");
            }
        }

        scanner.close();

        // If no players were entered, print message and exit
        if (players.isEmpty()) {
            System.out.println("No player data entered.");
        } else {
            // Compute average age and find the tallest player
            int totalAge = 0;
            int totalHeightInches = 0;
            Player tallestPlayer = players.get(0); // Assume first player is the tallest initially

            for (Player player : players) {
                int heightInInches = player.getHeight().toInches();
                totalHeightInches += heightInInches;
                totalAge += player.getAge(); // ✅ Corrected age calculation

                if (heightInInches > tallestPlayer.getHeight().toInches()) {
                    tallestPlayer = player;
                }
            }

            double averageAge = (double) totalAge / players.size();
            double averageHeight = (double) totalHeightInches / players.size();

            System.out.println("The average age of all players is " + averageAge);
            System.out.println("The tallest player whose age is less than the average is:");
            System.out.println("Name: " + tallestPlayer.getName() + " Age: " + tallestPlayer.getAge() + " Height: " + "(" + tallestPlayer.getHeight() + ")");
        }
        scanner.close();
    }
}
