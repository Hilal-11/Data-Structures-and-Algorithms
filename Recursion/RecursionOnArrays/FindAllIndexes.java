package RecursionOnArrays;

import java.util.ArrayList;

public class FindAllIndexes {
    static void FindAllIndexes(int data[], int n, int target, int index) {

        // BaseCase

        if (index == n) {
            return;
        }

        // Self Work
        if (data[index] == target) {
            System.out.print(index + "\t");
        }
        FindAllIndexes(data, n, target, index + 1);

    }

    public static void main(String[] args) {
        int data[] = { 2, 2, 2 };
        int target = 2;
        int n = data.length;

        FindAllIndexes(data, n, target, 0);
    }
}
