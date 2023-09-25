package PrefixSumProblems;

import java.util.Scanner;

public class sumOfQquries1_basedIndex {

    static int[] PrefixSum(int data[]) {
        int n = data.length;
        for (int i = 1; i < n; i++) {
            data[i] = data[i] + data[i - 1];
        }
        return data;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = input.nextInt();

        int data[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            data[i] = input.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(data[i] + "\t");
        }

        int pref[] = PrefixSum(data);

        System.out.println();
        System.out.println("Enter Number of Quries : ");
        int q = input.nextInt();

        while (q > 0) {
            System.out.print("Enter range : ");
            int l = input.nextInt();
            int r = input.nextInt();

            int ans = pref[r] - pref[l - 1];
            System.out.println(ans);
            q--;
        }

    }
}
