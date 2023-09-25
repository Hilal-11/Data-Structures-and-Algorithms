package Recursion;

import java.util.Scanner;

public class recursionPrint_n_1_1_n {

    static void printing(int n) {
        if (n == 0)
            return;

        System.out.print(n + "\t");
        printing(n - 1);
        System.out.print(n + "\t");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of n :- ");
        int n = input.nextInt();
        printing(n);
    }
}