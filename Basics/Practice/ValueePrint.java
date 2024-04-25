import java.util.Scanner;

public class ValueePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input integers
        System.out.print("Enter an integer (a): ");
        int a = sc.nextInt();
        System.out.print("Enter another integer (b): ");
        int b = sc.nextInt();

        // Input floats
        System.out.print("Enter a float (c): ");
        float c = sc.nextFloat();
        System.out.print("Enter another float (d): ");
        float d = sc.nextFloat();

        // Input doubles
        System.out.print("Enter a double (e): ");
        double e = sc.nextDouble();
        System.out.print("Enter another double (f): ");
        double f = sc.nextDouble();

        // Perform arithmetic operations
        int intSum = a + b;
        int intDifference = a - b;
        int intProduct = a * b;
        float floatSum = c + d;
        float floatDifference = c - d;
        float floatProduct = c * d;
        double doubleSum = e + f;
        double doubleDifference = e - f;
        double doubleProduct = e * f;
        double doubleQuotient = e / f;

        // Print results
        System.out.println("Integer Sum: " + intSum);
        System.out.println("Integer Difference: " + intDifference);
        System.out.println("Integer Product: " + intProduct);
        System.out.println("Float Sum: " + floatSum);
        System.out.println("Float Difference: " + floatDifference);
        System.out.println("Float Product: " + floatProduct);
        System.out.println("Double Sum: " + doubleSum);
        System.out.println("Double Difference: " + doubleDifference);
        System.out.println("Double Product: " + doubleProduct);
        System.out.println("Double Quotient: " + doubleQuotient);

        sc.close();
    }
}
