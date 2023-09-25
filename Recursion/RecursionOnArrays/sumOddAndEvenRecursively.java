package RecursionOnArrays;

public class sumOddAndEvenRecursively {

    static int oddSum(int data[], int i) {

        int n = data.length;
        if (i == n - 1) {
            return data[i];
        }

        int sum = 0;

        int smallAns = oddSum(data, i + 1);
        if (data[i] % 2 != 0) {
            sum = sum + data[i];
        }

        return sum;

    }

    public static void main(String[] args) {
        int data[] = { 1, 2, 4, 7, 9, 8, 6 };

        System.out.println(oddSum(data, 0));
    }
}
