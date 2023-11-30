package BinarySearch;

public class FindLastOccurrence {
    public static int FindLastOccurrence(int data[], int x) {
        int n = data.length;
        int str = 0;
        int end = n - 1;
        int ans = -1;

        while (str < end) {
            int mid = str + (end - str) / 2;
            if (x == data[mid]) {
                ans = mid;
                str = mid + 1;
            }

            else if (x > data[mid]) {
                str = mid + 1;
            }

            else if (x < data[mid]) {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int data[] = { 1, 2, 2, 2, 4, 5, 7, 9 };
        int x = 2;
        System.out.println(FindLastOccurrence(data, x));
    }
}
