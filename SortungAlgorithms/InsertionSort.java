package SortungAlgorithms;

public class InsertionSort {

    static void InsertionSort(int data[]) {
        int n = data.length;

        for (int i = 1; i < n; i++) {

            int j = i;

            while (j > 0 && data[j] < data[j - 1]) {

                int temp = data[j];
                data[j] = data[j - 1];
                data[j - 1] = temp;
                j--;

            }
        }
    }

    public static void main(String[] args) {

        int data[] = { 5, 3, 4, 1, 2 };
        InsertionSort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }

    }
}
