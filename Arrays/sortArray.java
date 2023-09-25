import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {

        int data[] = { 11, 3, 4, 7, 8, 1, 4, 3, 2 };
        Arrays.sort(data); // inBuilt Method in java for Sorting

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
    }
}
