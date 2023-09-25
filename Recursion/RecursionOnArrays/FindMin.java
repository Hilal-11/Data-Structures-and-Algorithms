package RecursionOnArrays;

public class FindMin {

    static int FindMin(int data[], int i) {

        int n = data.length;
        if (i == n - 1) {
            return data[i];
        }
        int ans = 0;
        int smallAns = FindMin(data, i + 1);
        // return Math.min(data[i], smallAns);

        if (data[i] < smallAns) {
            ans = data[i];
        } else {
            ans = smallAns;
        }
        return ans;
    }

    public static void main(String[] args) {

        int data[] = { 10, 70, 8, 9, 5, 11 };
        System.out.println(FindMin(data, 0));

    }
}
