import java.sql.Array;
import java.util.Arrays;

public class KthSmallestAnsKthLargestElement {

    static int[] KthSmallestAnsKthLargestElement(int data[]) {

        Arrays.sort(data);
        int[] ans = { data[0 + 1], data[data.length - 1 - 1] };
        return ans;
    }

    public static void main(String[] args) {
        int data[] = { 2, 4, 5, 7, 8, 9, 11, 20 };

        int ans[] = KthSmallestAnsKthLargestElement(data);
        System.out.println("Kth Smallest Element : " + ans[0]);
        System.out.println("Kth Largest Element : " + ans[1]);

    }
}
