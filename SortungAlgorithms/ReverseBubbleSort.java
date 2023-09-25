package SortungAlgorithms;

public class ReverseBubbleSort {

    // static void ReverseBubbleSort(int data[]) {
    // int n = data.length;
    // for (int i = n - 1; i >= 0; i--) {
    // boolean flag = false;
    // for (int j = n - i - 1; j > 0; j--) {
    // if (data[j] > data[j - 1]) {
    // int temp = data[j];
    // data[j] = data[j - 1];
    // data[j - 1] = temp;
    // flag = true;
    // }
    // }

    // if (flag == false) {
    // return;
    // }
    // }
    // }

    static void ReverseBubbleSort(int data[]) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] < data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    flag = true;
                }
            }

            if (flag == false) {
                return;
            }
        }
    }

    public static void main(String[] args) {

        int data[] = { 90, 77, 6, 0, 55, 44, 33, 1, 3, 5, 2, 6, 8 };

        ReverseBubbleSort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }

    }
}
