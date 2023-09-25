package SortungAlgorithms;

public class SortingAlgorithmPractice {

    // Bubble Sort Implementation
    // Bubble Sort Implementation

    static void bubbleSort(int data[]) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort Implementation
    // Selection Sort Implementation

    static void selectionSort(int data[]) {
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = data[min];
                data[min] = data[i];
                data[i] = temp;
            }

        }

    }

    // Insertion Sort Implementation
    // Insertion Sort Implementation

    static void insertionSort(int data[]) {
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

    // Move Zeros
    // Move Zeros

    static void moveZeros(int data[]) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (data[j] == 0 && data[j + 1] != 0) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // int data[] = { 90, 77, 6, 0, 55, 44, 33, 1, 3, 5, 2, 6, 8 };
        // System.out.print("Bubble Sort:: ");
        // bubbleSort(data);
        // for (int i = 0; i < data.length; i++) {
        // System.out.print(data[i] + "\t");
        // }
        // System.out.println("\n");
        // System.out.print("Selection Sort:: ");
        // selectionSort(data);
        // for (int i = 0; i < data.length; i++) {
        // System.out.print(data[i] + "\t");
        // }
        // System.out.println("\n");
        // System.out.print("Insertion Sort:: ");
        // insertionSort(data);
        // for (int i = 0; i < data.length; i++) {
        // System.out.print(data[i] + "\t");
        // }

        int data[] = { 0, 77, 6, 0, 0, 44, 0, 1, 3, 5, 2, 6, 8 };
        moveZeros(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }

    }
}
