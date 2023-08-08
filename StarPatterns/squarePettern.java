package StarPatterns;

import java.util.Scanner;

public class squarePettern {

    public static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // * * * * * *
    // * * * * * *
    // * * * * * *
    // * * * * * *
    // * * * * * *
    // * * * * * *

    // public static void patternNum(int n) {
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n; col++) {
    // System.out.print(" " + col + " ");
    // }
    // System.out.println();
    // }
    // }

    // 1 2 3 4 5
    // 1 2 3 4 5
    // 1 2 3 4 5
    // 1 2 3 4 5
    // 1 2 3 4 5

    // public static void patternNum(int n) {
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= n; col++) {
    // System.out.print(" " + row + " ");
    // }
    // System.out.println();
    // }
    // }
    // 1 1 1 1 1
    // 2 2 2 2 2
    // 3 3 3 3 3
    // 4 4 4 4 4
    // 5 5 5 5 5

    // public static void patternAlpha(int n) {
    // for (int row = 65; row <= n; row++) {
    // for (int col = 65; col <= n; col++) {
    // System.out.printf(" %c ", col);
    // }
    // System.out.println();
    // }
    // }
    // A B C D
    // A B C D
    // A B C D
    // A B C D

    // public static void patternAlpha(int n) {
    // for (int row = 65; row <= n; row++) {
    // for (int col = 65; col <= n; col++) {
    // System.out.printf(" %c ", row);
    // }
    // System.out.println();
    // }
    // }
    // A A A A
    // B B B B
    // C C C C
    // D D D D

    public static void patternAlpha(int n) {
        char ch = 'A';
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(" " + ch + " ");
                ch = (char) (ch + 1);
            }
            System.out.println();
        }
    }
    // A B C D E
    // F G H I J
    // K L M N O
    // P Q R S T
    // U V W X Y

    // public static void patternAlpha(int n) {
    // for (int row = 1; row <= n; row++) {
    // char ch = 'A';
    // for (int col = 1; col <= n; col++) {
    // System.out.print(" " + ch + " ");
    // ch = (char) (ch + 1);
    // }
    // System.out.println();
    // }
    // }

    // A B C D
    // A B C D
    // A B C D
    // A B C D

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of n :- ");
        int n = input.nextInt();

        patternAlpha(n);

    }
}