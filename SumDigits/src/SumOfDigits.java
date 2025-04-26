import java.util.Scanner;

public class SumOfDigits {
    public static int sumDigits(int n)    {
        if (n == 0) {
            return 0;
        }
        else {
            return (n % 10) + sumDigits(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = scanner.nextInt();
        System.out.println(sumDigits(sumDigits(n)));

    }
}
