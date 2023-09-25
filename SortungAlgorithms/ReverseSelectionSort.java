package SortungAlgorithms;

public class ReverseSelectionSort {

    // static void ReverseSelectionSort(int data[]) {
    // int n = data.length;

    // for (int i = 0; i < n - 1; i++) {
    // int maxIndex = i;
    // for (int j = i + 1; j < n; j++) {
    // if (data[j] > data[maxIndex]) {
    // maxIndex = j;
    // }
    // }

    // int temp = data[i];
    // data[i] = data[maxIndex];
    // data[maxIndex] = temp;
    // }
    // }

    static void ReverseSelectionSort(int data[]) {
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = data[i];
            data[i] = data[maxIndex];
            data[maxIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int data[] = { 90, 77, 6, 0, 55, 44, 33, 1, 3, 5, 2, 6, 8 };
        ReverseSelectionSort(data);

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }

    }
}
