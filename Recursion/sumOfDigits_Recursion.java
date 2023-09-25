package Recursion;

import java.util.Scanner;

public class sumOfDigits_Recursion {

    // static int sumOfDigits(int n) {
    // if (n >= 0 && n <= 9)
    // return n;

    // int smallProb = sumOfDigits(n / 10);
    // int ans = smallProb + n % 10;

    // return ans;

    // // return sumOfDigits(n / 10) + n % 10;

    // }

    static int totalDigits(int n) {
        if (n >= 0 && n <= 9)
            return 1;
        int t = 0;
        return totalDigits(n / 10) + t + 1;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of n :- ");
        int n = input.nextInt();

        // System.out.println(sumOfDigits(n));
        System.out.println(totalDigits(n));

    }
}
