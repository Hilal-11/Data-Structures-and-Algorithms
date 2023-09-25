package Recursion;

import java.util.Scanner;

public class powerFunction {

    // static int power(int p, int q) {
    // if (q == 0) {
    // return 1;
    // }

    // else {
    // return power(p, q - 1) * p;
    // }
    // }

    // Second approach
    // Second approach

    // static int power(int p, int q) {
    // if (q == 0) {
    // return 1;
    // }
    // if (q % 2 == 0) {
    // return power(p, q / 2) * power(p, q / 2);
    // } else {

    // return p * power(p, q / 2) * power(p, q / 2);
    // }

    // }

    // static int power(int p, int q) {
    // if (q == 0) {
    // return 1;
    // }
    // if (q % 2 == 0) {
    // int smallans = power(p, q / 2);
    // return smallans * smallans;
    // } else {
    // int smallans = power(p, q / 2);
    // return p * smallans * smallans;
    // }

    // }

    static int power(int p, int q) {
        if (q == 0) {
            return 1;
        }
        int smallans = power(p, q / 2);

        if (q % 2 == 0) {
            return smallans * smallans;
        } else {
            return p * smallans * smallans;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of p :- ");
        int p = input.nextInt();
        System.out.println("Enter value of q :- ");
        int q = input.nextInt();

        System.out.println(power(p, q));

    }
}
