package MultiDimensionalArrays;

import java.util.Scanner;

public class PascialsTiangle {

    static void printing(int data[][]) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    static int[][] PascialsTiangle(int n) {

        int ans[][] = new int[n][];
        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1];

            ans[i][0] = 1;
            ans[i][i] = 1;

            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("\n");
        int ans[][] = PascialsTiangle(n);
        printing(ans);
    }
}
