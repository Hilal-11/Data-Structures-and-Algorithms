package SortungAlgorithms;

public class SelectionSort {

    static void SelectionSort(int data[]) {

        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {

                if (data[j] < data[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = data[i];
                data[i] = data[min];
                data[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int data[] = { 90, 77, 6, 0, 55, 44, 33, 1, 3, 5, 2, 6, 8 };

        SelectionSort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
    }
}
