package PrefixSumProblems;

import java.util.Scanner;

public class prefixSum {

    static void print(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
    }

    static int[] prefixSum(int[] data) {
        int n = data.length;
        int pref[] = new int[n];
        pref[0] = data[0];

        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + data[i];

        }
        return pref;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = input.nextInt();

        int data[] = new int[n];
        for (int i = 0; i < data.length; i++) {
            data[i] = input.nextInt();
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }

        System.out.println();
        int pref[] = prefixSum(data);
        print(pref);

    }
}
