import java.util.Scanner;

public class sumOfOddsumOfEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n :- ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }
        }
        System.out.println("\n");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "\t");
            }
        }
    }
}
