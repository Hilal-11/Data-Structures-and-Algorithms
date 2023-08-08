import java.util.Scanner;

public class factorial {

    public static void Factorials(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of n :" + fact);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of num1 :- ");
        int n = input.nextInt();

        Factorials(n);
    }
}
