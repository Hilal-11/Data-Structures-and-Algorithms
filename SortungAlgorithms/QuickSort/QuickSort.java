package SortungAlgorithms.QuickSort;

public class QuickSort {
    static void display(int data[]) {
        int n = data.length;
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + "\t");
        }
    }

    static void swaping(int data[], int x, int y) {
        int temp = data[x];
        data[x] = data[y];
        data[y] = temp;
    }

    static int partition(int data[], int strt, int end) {

        int pivot = data[strt];
        int count = 0;

        for (int i = strt + 1; i <= end; i++) {
            if (data[i] < pivot) {
                count++;
            }
        }
        int pivotIndex = strt + count;
        swaping(data, strt, pivotIndex);

        int i = strt;
        int j = end;

        while (i < pivotIndex && j > pivotIndex) {

            while (data[i] < pivot) {
                i++;
            }
            while (data[j] > pivot) {
                j--;
            }

            if (i < pivotIndex && j > pivotIndex) {
                swaping(data, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;

    }

    static void QuickSort(int data[], int strt, int end) {

        if (strt >= end) {
            return;
        }
        int pi = partition(data, strt, end);
        QuickSort(data, strt, pi - 1);
        QuickSort(data, pi + 1, end);

    }

    public static void main(String[] args) {

        int data[] = { 90, 77, 6, 0, 55, 44, 33, 1, 3, 5, 2, 6 };
        int n = data.length;
        QuickSort(data, 0, n - 1);
        display(data);
    }
}
