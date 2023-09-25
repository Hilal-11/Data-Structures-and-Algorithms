package MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class sort2DArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int data[][] = new int[4][4];
        int n = data.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                data[i][j] = input.nextInt();
            }
        }

        Arrays.sort(data);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }

        // 11 2 12 5 4 15 10 7 9 6 7 8 5 4 3 2
    }
}
