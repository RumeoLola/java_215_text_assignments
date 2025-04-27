// Write your imports here if needed

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise {

    // Write your code here
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        long number = scanner.nextLong();
        if (number < 0) {
            System.out.println("Enter positive numbers only");
        }
        else    {
            System.out.println("The factorial of " + number + " is " + factorial(BigInteger.valueOf(number)));
        }
    }

    public static BigInteger factorial(BigInteger number)    {
        if (number.equals(BigInteger.ZERO))
            return BigInteger.ONE;
        else
            return number.multiply(factorial(number.subtract(BigInteger.ONE)));
    }
}
