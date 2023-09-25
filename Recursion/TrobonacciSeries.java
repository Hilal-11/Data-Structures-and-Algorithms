package Recursion;

import java.util.Scanner;

public class TrobonacciSeries {

    static int TribonacciSeries(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        int result = TribonacciSeries(n - 1) + TribonacciSeries(n - 2) + TribonacciSeries(n - 3);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n :- ");
        int n = input.nextInt();

        System.out.println(TribonacciSeries(n));
    }

}
