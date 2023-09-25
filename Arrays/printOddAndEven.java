import java.util.Scanner;

public class printOddAndEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of Array :- ");
        int n = input.nextInt();

        int data[] = new int[n];
        for (int i = 0; i < data.length; i++) {
            data[i] = input.nextInt();
        }

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println("\n");
        // print odd
        // print odd
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                System.out.print(data[i] + "\t");

            }
        }
        System.out.println();
        // print even
        // print even
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                System.out.print(data[i] + "\t");
            }
        }

    }
}
