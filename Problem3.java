// Problem3.java
// Print odd numbers up to input a (if even, up to previous odd)

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int limit;
        if (a % 2 == 0) {
            limit = a - 1;
        } else {
            limit = a;
        }

        int count = 1;
        for (int i = 1; i <= limit * 2 - 1; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}
