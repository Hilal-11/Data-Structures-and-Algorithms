// package Arrays;

import java.util.Scanner;

public class LinearSearch {
    // Using a Method
    // Using a Method

    // static void searching(int linearData[], int key) {
    // boolean ans = false;
    // for (int i = 0; i < linearData.length; i++) {
    // if (linearData[i] == key) {
    // ans = true;
    // System.out.println(ans);
    // return;
    // }
    // }
    // System.out.println(ans);
    // }

    static boolean Search(int linearData[], int key) {
        for (int i = 0; i < linearData.length; i++) {
            if (linearData[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Element for Searching :- ");
        int key = input.nextInt();
        int linearData[] = { 19, 44, 77, 10, 99, 11, 14, 16 };

        boolean found = Search(linearData, key);
        if (found) {
            System.out.println(key + " is Present");
        } else {
            System.out.println(key + " is Absent");
        }

        // searching(linearData, key);

        // without Using a Method
        // without Using a Method

        // boolean ans = false;
        // for (int i = 0; i < linearData.length; i++) {

        // if (linearData[i] == key) {
        // ans = true;
        // System.out.println(ans);
        // return;
        // }
        // }
        // System.err.println(ans);

    }
}
