package TwoPointersApproach;

import java.util.Scanner;

public class SortZerosAndOnes__TwoPointersApproach {

    static void SortZerosAndOnes(int data[]) {
        int n = data.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (data[left] == 1 && data[right] == 0) {
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }

            if (data[left] == 0) {
                left++;
            }
            if (data[right] == 1) {
                right--;
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
        System.out.print("UnSorted :: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }

        System.out.println();
        System.out.print("Sorted :: ");
        SortZerosAndOnes(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }

    }
}
