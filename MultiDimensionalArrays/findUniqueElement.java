package MultiDimensionalArrays;

import java.util.Scanner;

public class findUniqueElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int data[][] = new int[4][4];
        int n = data.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                data[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                for (int k = i + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if (data[i][j] == data[k][l]) {
                            data[i][j] = -1;
                            data[k][l] = -1;
                        }
                    }
                }
            }
        }
        // 11 11 22 22 33 33 44 44 55 55 100 55 66 66 66 66

        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println("\n");
        }
        // int ans = 0;

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {

        // if (data[i][j] > 0) {
        // ans = data[i][j];
        // }
        // }
        // }

        // System.out.println("Unique Element : " + ans);

    }
}
