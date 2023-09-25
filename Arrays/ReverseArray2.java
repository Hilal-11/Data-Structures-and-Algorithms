public class ReverseArray2 {

    // static int[] reverse(int[] arr) {
    // int n = arr.length;
    // int[] ans = new int[n];
    // int j = 0;
    // for (int i = n - 1; i >= 0; i--) {

    // ans[j++] = arr[i];

    // }
    // return ans;
    // }

    static void reverse(int arr[]) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + "\t");
        }
    }

    public static void main(String[] args) {

        // int[] arr = { 1, 2, 3, 4, 5 };
        // int[] ans = reverse(arr);
        // for (int i = 0; i < ans.length; i++) {
        // System.out.print(ans[i] + "\t");
        // }

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        reverse(arr);

    }
}
