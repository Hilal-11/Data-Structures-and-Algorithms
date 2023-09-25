package RecursionOnArrays;

public class findNrecursevely {

    static boolean findNrecursevely(int data[], int n, int target, int index) {

        // basecase
        if (index >= n) {
            return false;
        }

        // self work

        if (data[index] == target) {
            return true;
        }

        // recursive work

        if (findNrecursevely(data, n, target, index + 1)) {
            return true;
        } else {
            return false;
        }

        // or
        // return findNrecursevely(data, n, target, index+1);
    }

    static int findIndexes(int data[], int n, int target, int index) {

        // basecase
        if (index >= n) {
            return -1;
        }

        // self work

        if (data[index] == target) {
            return index;
        }

        // recursive work

        return findIndexes(data, n, target, index + 1);

    }

    public static void main(String[] args) {

        int data[] = { 4, 5, 7, 11, 14, 7, 8, 10 };
        int target = 10;
        int n = data.length;

        // if (findNrecursevely(data, n, target, 0)) {
        // System.out.println("Yes " + target + " is Present");
        // } else {
        // System.out.println("No " + target + " is Not Present");
        // }

        System.out.println(findIndexes(data, n, target, 0));

    }
}
