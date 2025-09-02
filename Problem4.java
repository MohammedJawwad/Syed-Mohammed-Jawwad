// Problem4.java
// Count multiples of 1 to 9 in a list

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers separated by space: ");
        String line = sc.nextLine();
        String[] parts = line.split(" ");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        // our place to store our counts
        int[] counts = new int[10];         // index 1 to 9 so 10

        // For each number in our list
        for (int number : arr) {
            //we are checking divisibility by 1 to 9
            for (int divisor = 1; divisor <= 9; divisor++) {
                if (number % divisor == 0) {
                    counts[divisor]++;
                }
            }
        }

        // we are printing results now
        System.out.print("{");
        for (int j = 1; j <= 9; j++) {
            System.out.print(j + ": " + counts[j]);
            if (j < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        sc.close();
    }
}
