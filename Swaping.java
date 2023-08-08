import java.util.Scanner;

public class Swaping {

    // public static void swaping(int num1, int num2) {
    // num1 = num1 + num2;
    // num2 = num1 - num2;
    // num1 = num1 - num2;
    // System.out.println("After Swaping num1 : " + num1);
    // System.out.println("After Swaping num2 : " + num2);
    // }

    public static void swaping(int num1, int num2) {
        num1 = num1 * num2;
        num2 = num1 / num2;
        num1 = num1 / num2;
        System.out.println("After Swaping num1 : " + num1);
        System.out.println("After Swaping num2 : " + num2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of num1 :- ");
        int num1 = input.nextInt();
        System.out.print("Enter value of num2 :- ");
        int num2 = input.nextInt();

        // using a temporary variable
        // using a temporary variable

        // System.out.println();
        // System.out.println("Before Swaping num1 : " + num1);
        // System.out.println("Before Swaping num2 : " + num2);

        // int temp;

        // temp = num1;
        // num1 = num2;
        // num2 = temp;

        // System.out.println();
        // System.out.println("After Swaping num1 : " + num1);
        // System.out.println("After Swaping num2 : " + num2);

        // without using temporary variable
        // without using temporary variable

        // swaping(num1, num2);

        // Swaping with multiplication method temporary variable
        // Swaping with multiplication method temporary variable
        System.out.println("Before Swaping num1 : " + num1);
        System.out.println("Before Swaping num2 : " + num2);

        System.out.println("\n  ");

        swaping(num1, num2);
    }
}