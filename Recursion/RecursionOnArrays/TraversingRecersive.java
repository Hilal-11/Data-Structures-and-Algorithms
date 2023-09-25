package RecursionOnArrays;

import java.util.ArrayList;

public class TraversingRecersive {
    static void traversingRecersive(int[] data, int i) {
        int n = data.length;
        if (i == n) {
            return;
        }
        System.out.print(data[i] + "\t");
        traversingRecersive(data, i + 1);
    }

    public static void main(String[] args) {
        int data[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        traversingRecersive(data, 0);
    }
}
