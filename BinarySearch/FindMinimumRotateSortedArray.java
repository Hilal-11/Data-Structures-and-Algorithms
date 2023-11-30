package BinarySearch;

public class FindMinimumRotateSortedArray {

    // Recursive Approach
    // Recursive Approach

    public static int FindMinimumRotateSortedArray(int data[]) {
        int n = data.length;
        int str = 0;
        int end = n - 1;

        int ans = -1;

        while (str < end) {
            int mid = str + (end - str) / 2;
            if (data[mid] >= data[n - 1]) {
                str = mid + 1;
            }

            else if (data[mid] <= data[n - 1]) {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
    // Recursive Approach
    // Recursive Approach

    public static int FindMinimumRotateSortedArray2(int data[], int str, int end) {

        int ans = -1;
        int n = data.length;

        if (str > end) {
            return -1;
        }

        int mid = str + (end - str) / 2;

        if (data[mid] >= data[n - 1]) {
            FindMinimumRotateSortedArray2(data, mid + 1, end);
        }

        else if (data[mid] <= data[n - 1]) {
            FindMinimumRotateSortedArray2(data, str, mid - 1);
            ans = mid;

        }
        return ans;

    }

    public static void main(String[] args) {

        int data[] = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // System.out.println(FindMinimumRotateSortedArray(data));
        int l = data.length;
        int str = 0;
        int end = l - 1;

        System.out.println(FindMinimumRotateSortedArray2(data, str, end));

    }
}
