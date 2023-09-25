import java.util.Scanner;

public class SwapeAlternateArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of Array :- ");
        int n = input.nextInt();

        int data[] = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < n; i += 2) {
            if (i + 1 < n) {
                int temp = data[i];
                data[i] = data[i + 1];
                data[i + 1] = temp;

            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + "\t");
        }

    }
}
