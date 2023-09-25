package RecursionOnArrays;

import java.util.ArrayList;

public class FindAllIndexesReturnArrayList {

    static ArrayList<Integer> FindAllIndexesArray(int data[], int n, int target, int index) {
        // base Case

        if (index >= n) {
            return new ArrayList<Integer>();
        }

        // self Work
        ArrayList<Integer> ans = new ArrayList<>();

        if (data[index] == target) {
            ans.add(index);
        }

        // recursive work
        ArrayList<Integer> smallAns = FindAllIndexesArray(data, n, target, index + 1);
        ans.addAll(smallAns);
        return ans;

    }

    public static void main(String[] args) {

        int data[] = { 4, 5, 7, 11, 4, 7, 8, 4 };
        int target = 4;
        int n = data.length;

        ArrayList<Integer> ans = FindAllIndexesArray(data, n, target, 0);
        System.out.println(ans);

    }
}
