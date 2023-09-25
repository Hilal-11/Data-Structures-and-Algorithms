package RecursionOnArrays;

public class isSort {

    // static boolean isSorted(int data[]) {

    // boolean check = true;
    // for (int i = 1; i < data.length; i++) {
    // if (data[i] < data[i - 1]) {
    // check = false;
    // break;
    // }
    // }

    // return check;
    // }

    static boolean isSorted(int data[], int n) {

        if (n == 0 || n == 1) {
            return true;
        }
        boolean ans = true;

        if (data[n - 1] < data[n - 2]) {
            ans = false;
        }
        isSorted(data, n - 1);

        return ans;

    }

    public static void main(String[] args) {

        int data[] = { 1, 2, 13, 4, 6, 17, 8 };
        int n = data.length;

        if (isSorted(data, n)) {
            System.out.println("Sorted");
        } else {
            System.out.println("UnSorted");
        }

    }
}
