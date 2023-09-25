package SortungAlgorithms;

public class BubbleSort {

    // static void BubbleSort(int data[]) {

    // int n = data.length;
    // for (int i = 0; i < n - 1; i++) {
    // for (int j = 0; j < n - i - 1; j++) {

    // if (data[j] > data[j + 1]) {

    // int temp = data[j];
    // data[j] = data[j + 1];
    // data[j + 1] = temp;
    // }
    // }
    // }
    // }

    static void BubbleSort(int data[]) {

        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {

                if (data[j] > data[j + 1]) {

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

        int data[] = { 1, 2, 3, 4, 5 };

        BubbleSort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }

    }
}
