package enUygunPractice;

import java.util.Scanner;

public class sumAB {
    public static void main(String[] args) {

        /*
          A sum-based project is a great way to get started with Java programming.
          The project is quite simple — the user will input two numbers (which are treated as the variables A and B),
          and the program will add them together and present the sum of A + B.
       */
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the first number (A): ");
        int a = scan.nextInt();
        System.out.print("Please enter the second number (B): ");
        int b = scan.nextInt();
        int sum = a+b;
        System.out.println("Sum of (A) and (B): "+sum);
    }
}
