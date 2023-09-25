package SortungAlgorithms;

public class ReverseInsertionSort {

    static void ReverseInsertionSort(int data[]) {
        int n = data.length;

        for (int i = 1; i < n; i++) {

            int j = i;
            while (j > 0 && data[j] > data[j - 1]) {
                int temp = data[j];
                data[j] = data[j - 1];
                data[j - 1] = temp;
                j--;
            }
        }

    }

    public static void main(String[] args) {
        int data[] = { 90, 77, 6, 0, 55, 44, 33, 1, 3, 5, 2, 6, 8 };
        ReverseInsertionSort(data);

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
    }
}
