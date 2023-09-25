import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class ArraysPractice {

    // Maximum value
    // Maximum value

    static int max_value(int data[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
            }
        }
        return max;
    }

    // Minimum Value
    // Minimum Value

    static int min_value(int data[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (min > data[i]) {
                min = data[i];
            }
        }
        return min;
    }

    // Kth Maximum value
    // Kth Maximum value

    static int KthMax(int data[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
            }
        }

        int s_max = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > s_max && data[i] < max) {
                s_max = data[i];
            }
        }
        return s_max;
    }

    // Kth Minimum value
    // Kth Minimum value

    static int KthMin(int data[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }

        int s_min = Integer.MAX_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < s_min && data[i] > min) {
                s_min = data[i];
            }
        }
        return s_min;
    }

    // Reverse Array using extra array
    // Reverse Array using extra array

    static int[] reverse(int data[]) {

        int n = data.length;
        int ans[] = new int[n];
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans[j] = data[i];
            j++;
        }
        return ans;
    }

    // Make Frequency Array for (q) times Searching
    // Make Frequency Array for (q) times Searching

    static int[] makeFrequncyArray(int data[]) {

        int freq[] = new int[10005];
        for (int i = 0; i < data.length; i++) {
            freq[data[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter size of array : ");
        // int n = input.nextInt();
        // int data[] = new int[n];
        // for (int i = 0; i < data.length; i++) {
        // data[i] = input.nextInt();
        // }

        // int freq[] = makeFrequncyArray(data);
        // System.out.println("Enter no of quries : ");
        // int q = input.nextInt();

        // while (q > 0) {
        // System.out.println("Enter value for Searching : ");
        // int s = input.nextInt();

        // if (freq[s] > 0) {
        // System.out.println("Yes Value is Present");
        // } else {
        // System.out.println("No Value is Not Present");
        // }

        // q--;
        // }

        // Linear Searching
        // Linear Searching

        // int data[] = { 1, 2, 3, 4, 6, 5, 7, 8, 9, 10 };
        // int ans = KthMax(data);
        // System.out.println(ans);

        // int ans2 = KthMin(data);
        // System.out.println(ans2);

        // int data[] = { 1, 2, 3, 4, 5 };
        // for (int i = 0; i < data.length; i++) {
        // System.out.print(data[i] + "\t");
        // }
        // System.out.println();
        // int ans[] = reverse(data);
        // for (int i = 0; i < ans.length; i++) {
        // System.out.print(ans[i] + "\t");
        // }
        // int x = 5;
        // boolean ans = false;

        // for (int i = 0; i < data.length; i++) {
        // if (data[i] == x) {
        // ans = true;
        // }
        // }

        // if (ans == true) {
        // System.out.println(x + " is Present");
        // } else {
        // System.out.println(x + " is Not Present");

        // }

        // Count Occurriences
        // Count Occurriences

        // int data[] = { 1, 2, 3, 4, 6, 4, 7, 8, 4, 10 };
        // int x = 4;
        // int count = 0;
        // for (int i = 0; i < data.length; i++) {
        // if (data[i] == x) {
        // count++;
        // }
        // }

        // System.out.println(count);

        // Check Sort or Not
        // Check Sort or Not

        // int data[] = { 1, 2, 2, 3, 4, 5, 7, 8, 9, 10 };
        // boolean ans = true;
        // for (int i = 1; i < data.length; i++) {
        // if (data[i] < data[i - 1]) {
        // ans = false;
        // }
        // }

        // if (ans == true) {
        // System.out.println("Sorted");
        // } else {
        // System.out.println("Unsorted");
        // }

        // Check Sort or Not
        // Check Sort or Not

        // int data[] = { 1, 2, 3, 4, 5, 7, 8, 11, 12 };
        // boolean ans = true;
        // for (int i = 0; i < data.length - 1; i++) {
        // if (data[i] > data[i + 1]) {
        // ans = false;
        // break;
        // }
        // }
        // System.out.println(ans);
        //
        //
        //
        //

        // Minimum and Maximum value
        // Minimum and Maximum value
        //
        // ]=]=
        // int data[] = { 10, 4, 5, 7, 8, 11, 66, 110 };
        // System.out.println("Maximum : " + max_value(data));
        // System.out.println("Minimum : " + min_value(data));

    }
}
