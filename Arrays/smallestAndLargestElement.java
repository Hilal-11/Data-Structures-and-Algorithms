import java.sql.Array;
import java.util.Arrays;

public class smallestAndLargestElement {

    static int[] SmallestAndLargestElement(int data[]) {
        Arrays.sort(data);
        int ans[] = { data[0], data[data.length - 1] };

        return ans;
    }

    public static void main(String[] args) {

        int data[] = { 2, 4, 5, 7, 8, 9, 11, 20 };

        int ans[] = SmallestAndLargestElement(data);
        System.out.println("Smallest Element :- " + ans[0]);
        System.out.println("Larget Element :- " + ans[1]);

    }
}
