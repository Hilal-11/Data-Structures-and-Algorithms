package SortungAlgorithms;

import RecursionOnArrays.isSort;

public class CountSort {

    static void display(int data[]) {
        int n = data.length;
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + "\t");
        }
    }

    static int findMax(int data[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    static void countSort(int data[]) {
        int max = findMax(data);
        int count[] = new int[max + 1];
        for (int i = 0; i < data.length; i++) {
            count[data[i]]++;

        }

        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                data[k] = i;
                k++;
            }
        }

    }

    public static void main(String[] args) {
        int data[] = { 90, 77, 6, 0, 55, 44, 33, 1, 3, 5, 2, 6 };
        countSort(data);
        display(data);

    }
}
