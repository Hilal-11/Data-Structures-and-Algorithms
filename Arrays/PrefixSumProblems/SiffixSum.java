package PrefixSumProblems;

import java.util.Scanner;

public class SiffixSum {

    static int[] suffixSum(int data[]) {
        int suffixSum[] = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                suffixSum[i] = suffixSum[i] + data[j];
            }
        }
        return suffixSum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int data[] = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = input.nextInt();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();

        int ans[] = suffixSum(data);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + "\t");
        }

        // for (int i = 0; i < suffixSum.length; i++) {
        // for (int j = i; j < suffixSum.length; j++) {
        // suffixSum[i] = suffixSum[i] + data[j];
        // }
        // }

        // for (int i = 0; i < suffixSum.length; i++) {
        // System.out.print(suffixSum[i] + "\t");
        // }

    }

}
