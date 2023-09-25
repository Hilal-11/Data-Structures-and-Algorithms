public class RotateArrayKthTimes {

    static int[] RotateArrayKth(int data[], int k) {
        int n = data.length;
        k = k % n;

        int[] ans = new int[n];
        int j = 0;

        for (int i = n - k; i < data.length; i++) {
            ans[j++] = data[i];
        }

        for (int i = 0; i < n - k; i++) {
            ans[j++] = data[i];
        }

        return ans;

    }

    public static void main(String[] args) {

        int data[] = { 1, 2, 3, 4, 5 };
        int k = 102;

        int[] ans = RotateArrayKth(data, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + "\t");
        }
    }
}
