package PrefixSumProblems;

import java.util.Scanner;

public class prefixSum2ndApproach {

    static int[] prefixSum(int data[]) {
        int n = data.length;

        for (int i = 1; i < n; i++) {
            data[i] = data[i] + data[i - 1];
        }
        return data;
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

        prefixSum(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }

    }
}
