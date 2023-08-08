import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n :- ");
        int n = input.nextInt();
        int s = n;
        int r = 0;
        int arm = 0;
        while (n > 0) {
            r = n % 10;
            arm = (r * r * r) + arm;
            n = n / 10;

        }

        if (s == arm) {
            System.out.println(arm + " is a Armstrong Number");
        } else {
            System.out.println(arm + " is Not a Armstrong Number");
        }

    }
}
