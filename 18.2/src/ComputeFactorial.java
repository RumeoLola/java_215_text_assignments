import java.util.Scanner;

public class ComputeFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.println("The factorial of " + number + " is " + factorial(number));
    }

    public static int factorial(int number)    {
        try {
            if (number == 0)
                return 1;
            else
                return number * factorial(number - 1);
        }
        catch (Exception IllegalArgumentException)  {
            System.out.println("You cannot calculate the factorial of a negative number");
        }
        return factorial(number);
    }
}
