public class RotateArrayKthTimes_2nd_Approach {

    static void printing(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
    }

    static void reverse(int data[], int i, int j) {

        while (i < j) {
            int temp = data[i];
            data[i] = data[j];
            data[j] = temp;
            i++;
            j--;
        }
    }

    static void rotateInPlace(int data[], int k) {
        int n = data.length;
        k = k % n;
        reverse(data, 0, n - k - 1);
        reverse(data, n - k, n - 1);
        reverse(data, 0, n - 1);
    }

    public static void main(String[] args) {

        int data[] = { 1, 2, 3, 4, 5 };
        int k = 102;
        rotateInPlace(data, k);
        printing(data);
    }
}
