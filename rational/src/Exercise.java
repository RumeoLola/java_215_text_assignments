import java.math.*;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        // Prompt the user to enter two Rational numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rational r1 with numerator and denominator separated by a space: ");
        String n1 = input.next();
        String d1 = input.next();

        System.out.print("Enter rational r2 with numerator and denominator separated by a space: ");
        String n2 = input.next();
        String d2 = input.next();

        RationalUsingBigInteger r1 = new RationalUsingBigInteger(
                new BigInteger(n1), new BigInteger(d1));
        RationalUsingBigInteger r2 = new RationalUsingBigInteger(
                new BigInteger(n2), new BigInteger(d2));

        // Display results
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}

class RationalUsingBigInteger extends Number
        implements Comparable<RationalUsingBigInteger> {
    // Data fields for numerator and denominator
    private BigInteger numerator = BigInteger.ZERO;
    private BigInteger denominator = BigInteger.ONE;

    // WRITE YOUR CODE

    public RationalUsingBigInteger(BigInteger numerator, BigInteger denominator)    {
        if (denominator.equals(BigInteger.ZERO))    {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }

        BigInteger gcd = numerator.gcd(denominator);
        this.numerator = numerator.divide(gcd);
        this.denominator = denominator.divide(gcd);

        if (this.denominator.signum() < 0)  {
            this.numerator = this.numerator.negate();
            this.denominator = this.denominator.negate();
        }
    }

    // Add
    public RationalUsingBigInteger add(RationalUsingBigInteger other) {
        BigInteger newNumerator = this.numerator.multiply(other.denominator)
                .add(other.numerator.multiply(this.denominator));
        BigInteger newDenominator = this.denominator.multiply(other.denominator);
        return new RationalUsingBigInteger(newNumerator, newDenominator);
    }

    // Subtract
    public RationalUsingBigInteger subtract(RationalUsingBigInteger other) {
        BigInteger newNumerator = this.numerator.multiply(other.denominator)
                .subtract(other.numerator.multiply(this.denominator));
        BigInteger newDenominator = this.denominator.multiply(other.denominator);
        return new RationalUsingBigInteger(newNumerator, newDenominator);
    }

    // Multiply
    public RationalUsingBigInteger multiply(RationalUsingBigInteger other) {
        BigInteger newNumerator = this.numerator.multiply(other.numerator);
        BigInteger newDenominator = this.denominator.multiply(other.denominator);
        return new RationalUsingBigInteger(newNumerator, newDenominator);
    }

    // Divide
    public RationalUsingBigInteger divide(RationalUsingBigInteger other) {
        if (other.numerator.equals(BigInteger.ZERO)) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        BigInteger newNumerator = this.numerator.multiply(other.denominator);
        BigInteger newDenominator = this.denominator.multiply(other.numerator);
        return new RationalUsingBigInteger(newNumerator, newDenominator);
    }

    @Override
    public int intValue() {
        return numerator.divide(denominator).intValue();
    }

    @Override
    public long longValue() {
        return numerator.divide(denominator).intValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    // Double value (used for printing decimal approximation)
    public double doubleValue() {
        return numerator.doubleValue() / denominator.doubleValue();
    }

    @Override
    public int compareTo(RationalUsingBigInteger o) {
        BigInteger left = this.numerator.multiply(o.denominator);
        BigInteger right = o.numerator.multiply(o.denominator);
        return left.compareTo(right);
    }

    // Override the toString
    @Override
    public String toString() {
        if (denominator.equals(BigInteger.ONE)) {
            return numerator.toString();
        }
        return numerator + "/" + denominator;
    }
}
