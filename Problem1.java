// Problem1.java
// Simple Calculator program

import java.util.Scanner;

class Calculator {
    double a, b;

    Calculator(double x, double y) {
        a = x;
        b = y;
    }

    double add() {
        return a + b;
    }

    double subtract() {
        return a - b;
    }

    double multiply() {
        return a * b;
    }

    double divide() {
        if (b == 0) {
            System.out.println("Cannot be divisible by zero");
            return 0;
        }
        return a / b;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String op = sc.next();

        Calculator c = new Calculator(n1, n2);

        if (op.equals("add")) {
            System.out.println("Result = " + c.add());
        } else if (op.equals("sub")) {
            System.out.println("Result = " + c.subtract());
        } else if (op.equals("mul")) {
            System.out.println("Result = " + c.multiply());
        } else if (op.equals("div")) {
            System.out.println("Result = " + c.divide());
        } else {
            System.out.println("Invalid operation");
        }
        sc.close();
    }
}


