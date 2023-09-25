import java.util.Scanner;

public class SortZerosAndOnes {

    static void SortZerosAndOnes(int data[]) {
        int n = data.length;
        int zeros = 0;

        for (int i = 0; i < n; i++) {
            if (data[i] == 0) {
                zeros++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i < zeros) {
                data[i] = 0;
            } else {
                data[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = input.nextInt();

        int data[] = new int[n];
        for (int i = 0; i < data.length; i++) {
            data[i] = input.nextInt();
        }
        System.out.print("UnSorted :: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();
        System.out.print("Sorted :: ");
        SortZerosAndOnes(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }

    }
}
