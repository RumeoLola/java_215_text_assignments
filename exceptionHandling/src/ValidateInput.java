mport java.util.Scanner;

class ValidateInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            System.out.print("Please enter a number: ");
            String input = scanner.nextLine();

            try {
                number = Integer.parseInt(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("The input was not a number, try again.");
            }
        }

        System.out.println("The input is correct: " + number);
        scanner.close();
    }
}