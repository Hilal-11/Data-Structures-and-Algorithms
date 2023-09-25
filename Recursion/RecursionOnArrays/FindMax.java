package RecursionOnArrays;

public class FindMax {

    static int FindMax(int data[], int i) {
        int n = data.length;
        if (i == n - 1) {
            return data[i];
        }
        int ans = 0;
        int smallAns = FindMax(data, i + 1);
        // return Math.max(data[i], smallAns);

        if (data[i] > smallAns) {
            ans = data[i];
        } else {
            ans = smallAns;
        }
        return ans;

    }

    public static void main(String[] args) {

        int data[] = { 99, 2, 6, 190, 10, 11, 66, 10 };
        System.out.println(FindMax(data, 0));
    }
}
