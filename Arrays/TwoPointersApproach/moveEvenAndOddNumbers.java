package TwoPointersApproach;

import java.util.Scanner;

public class moveEvenAndOddNumbers {
    static void moveEvenAndOddNumbers(int data[]) {
        int n = data.length;
        int l = 0;
        int r = n - 1;

        while (l < r) {
            if (data[l] % 2 != 0 && data[r] % 2 == 0) {
                int temp = data[l];
                data[l] = data[r];
                data[r] = temp;
                l++;
                r--;
            }
            if (data[l] % 2 == 0) {
                l++;
            }
            if (data[r] % 2 != 0) {
                r--;
            }
        }
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
        moveEvenAndOddNumbers(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }

    }
}
