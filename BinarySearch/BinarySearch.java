package BinarySearch;

public class BinarySearch {

    public static boolean BinarySearchAlgorithm1(int data[], int target, int str,
            int end) {

        while (str < end) {

            int mid = (str + end) / 2;

            if (data[mid] == target) {
                return true;
            } else if (target < data[mid]) {
                end = mid - 1;
            } else if (target > data[mid]) {
                str = mid + 1;
            }
        }
        return false;
    }

    public static int BinarySearchAlgorithm2(int data[], int target, int str, int end) {
        int ans = -1;
        while (str < end) {

            int mid = (str + end) / 2;

            if (data[mid] == target) {
                return ans = data[mid];
            } else if (target < data[mid]) {
                end = mid - 1;
            } else if (target > data[mid]) {
                str = mid + 1;
            }
        }
        return ans;
    }

    // Recursive Approach Solve Binary Search
    // Recursive Approach Solve Binary Search

    public static boolean BinarySearchRecursively(int data[], int str, int end, int target) {

        // basecase
        if (str > end) {
            return false;
        }
        int mid = (str + end) / 2;
        // recrunce relation
        if (target == data[mid]) {
            return true;
        }

        else if (target > data[mid]) {
            return BinarySearchRecursively(data, mid + 1, end, target);
        }

        else if (target < data[mid]) {
            return BinarySearchRecursively(data, str, mid - 1, target);
        }
        return false;

    }

    public static void main(String[] args) {
        int data[] = { 2, 4, 5, 7, 15, 20, 24, 33, 44, 50, 70, 77 };
        int n = data.length;
        int str = 0;
        int end = n - 1;
        int target = 1;
        // System.out.println(BinarySearchAlgorithm1(data, target, str, end));
        // System.out.println(BinarySearchAlgorithm2(data, target, str, end));

        while (target < 10) {
            System.out.println(target + " is Exist " + BinarySearchRecursively(data, str, end, target));
            target++;
        }

    }
}
