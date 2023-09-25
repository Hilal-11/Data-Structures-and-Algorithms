package RecursionOnArrays;

public class Occurriences {

    static int CountOccurriences(int data[], int target, int index) {

        if (index == data.length) {
            return 0;

        }

        if (data[index] == target) {
            return 1 + CountOccurriences(data, target, index + 1);
        }
        return CountOccurriences(data, target, index + 1);
    }

    public static void main(String[] args) {

        int data[] = { 4, 5, 7, 11, 4, 7, 8, 4 };
        int target = 4;

        System.out.println(CountOccurriences(data, target, 0));

    }
}
