package StarPatterns;

import java.util.Scanner;

public class trianglePatterbs {

    // public static void trianglePattern(int n) {
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= row; col++) {
    // System.out.print(" * ");
    // }
    // System.out.println();
    // }
    // }

    // public static void trianglePattern(int n) {
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= row; col++) {
    // System.out.print(" " + col + " ");
    // }
    // System.out.println();
    // }
    // }

    // public static void trianglePattern(int n) {
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= row; col++) {
    // System.out.print(" " + col + " ");
    // }
    // System.out.println();
    // }
    // }

    // public static void trianglePattern(int n) {
    // char ch = 'A';
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= row; col++) {
    // System.out.print(" " + ch + " ");
    // ch = (char) (ch + 1);
    // }
    // System.out.println();
    // }
    // }

    public static void trianglePattern(int n) {
        for (int row = 1; row <= n; row++) {
            char ch = 'A';
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + ch + " ");
                ch = (char) (ch + 1);
            }
            System.out.println();
        }
    }

    // public static void trianglePattern(int n) {
    // char ch = 'A';
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1; col <= row; col++) {
    // System.out.print(" " + ch + " ");
    // ch = (char) (ch + 1);
    // }
    // System.out.println();

    // }
    // ch++;
    // }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of n :- ");
        int n = input.nextInt();
        trianglePattern(n);
    }
}
