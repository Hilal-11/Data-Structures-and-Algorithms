package RecursionOnArrays;

public class numberOfElementsX {

    static int totalOccurrieces(int data[], int target, int index) {

        if (index == data.length) {
            return 0;
        }

        if (data[index] == target) {
            return 1 + totalOccurrieces(data, target, index + 1);
        }

        return totalOccurrieces(data, target, index + 1);
    }

    public static void main(String[] args) {

        int data[] = { 2, 3, 4, 2, 5, 6, 2, 2 };
        int target = 2;

        System.out.println(totalOccurrieces(data, target, 0));
    }
}
