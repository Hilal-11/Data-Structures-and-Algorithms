package SortungAlgorithms;

public class MoveZeros {

    // Move Zeros in End of Array
    // Move Zeros in End of Array

    static void SortZeros(int data[]) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] == 0 && data[j + 1] != 0) {
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

        int data[] = { 0, 5, 0, 3, 42, 9, 0, 5, 6, 4, 0 };
        SortZeros(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "  ");
        }
    }
}
