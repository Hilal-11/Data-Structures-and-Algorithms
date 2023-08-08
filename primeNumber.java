import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n :- ");
        int n = input.nextInt();

        int check = 0;

        if (n == 1 || n == 2) {
            System.out.println(n + " is Prime Number");
            return;
        }
        for (int i = 2; i < n / 2 - 1; i++) {
            if (n % i != 0) {
                check = 1;
                break;
            } else {
                System.out.println(n + " is Not a Prime Number");
                break;

            }
        }

        if (check == 1) {
            System.out.println(n + " is Prime Number");
        }

    }
}
