import java.util.Scanner;

public class multiplicationTable {
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

        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(data[i] + " * " + j + " = " + data[i] * j);
            }
            System.out.println();
        }

    }
}
