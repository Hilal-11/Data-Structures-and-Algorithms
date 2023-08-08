import java.util.Scanner;

public class Febonachii {
    public static void febonachii(int n) {
        int a = 0;
        int b = 1;
        int c;

        for (int i = 0; i <= n; i++) {
            System.out.print(a + "\t");
            c = a + b;
            a = b;
            b = c;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of num1 :- ");
        int n = input.nextInt();

        febonachii(n);
    }
}
