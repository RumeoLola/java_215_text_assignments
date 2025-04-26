import java.util.Scanner;

public class RecursiveSum {
    public static int recursiveSum(int n)    {
        if (n <= 0) {
            return 0;
        }
        else {
            return n + recursiveSum(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursiveSum(5));
    }
}
