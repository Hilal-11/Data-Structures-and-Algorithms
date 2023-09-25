package MultiDimensionalArrays;

import java.util.Scanner;

public class sumOfTwoMatrices {

    static void printing(int data[][]) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    static void sumTwoMatrics(int data[][], int data2[][]) {

        // if (data.length != data2.length) {
        // System.out.println("Wrong Input Addition is not Possible");
        // return;
        // }
        int sum[][] = new int[data.length][data2.length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                sum[i][j] = data[i][j] + data2[i][j];
            }
        }

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {

        // int data[][] = {
        // { 1, 2, 3, 4 },
        // { 5, 6, 7, 8 },
        // { 9, 7, 5, 4 }
        // };
        // printing(data);

        // System.out.println("\n");
        // int data2[][] = {
        // { 1, 2, 3, 4 },
        // { 5, 6, 7, 8 },
        // { 9, 7, 5, 4 }
        // };
        // printing(data2);

        // System.out.println("\n");

        // for (int i = 0; i < data.length; i++) {
        // for (int j = 0; j < data[i].length; j++) {
        // data[i][j] += data2[i][j];
        // }
        // }
        // printing(data);

        // Scanner input = new Scanner(System.in);
        // int data[][] = new int[4][4];
        // for (int i = 0; i < data.length; i++) {
        // for (int j = 0; j < data[i].length; j++) {
        // data[i][j] = input.nextInt();
        // }
        // }

        // printing(data);

        // int data2[][] = new int[4][4];
        // for (int i = 0; i < data2.length; i++) {
        // for (int j = 0; j < data2[i].length; j++) {
        // data2[i][j] = input.nextInt();
        // }
        // }
        // printing(data2);

        // System.out.println("\n");
        // sumTwoMatrics(data, data2);
    }
}
