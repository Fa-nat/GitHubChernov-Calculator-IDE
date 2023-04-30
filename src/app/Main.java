package app;

public class Main {
    private static int a = 8;
    private static int b = 2;

    public static void main(String[] args) {
        System.out.println("Calculator for base calculations");
        System.out.println("Version 2.0");

        int c = add(a, b);
        System.out.println("Addition result: " + c);

        int d = subtract(a, b);
        System.out.println("Subtraction result: " + d);

        int e = multiply(a, b);
        System.out.println("Multiplication result: " + e);

        int f = divide(a, b);
        System.out.println("Division result: " + f);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }
}
