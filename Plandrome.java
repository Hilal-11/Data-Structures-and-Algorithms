import java.util.Scanner;

public class Plandrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of num1 :- ");
        int n = input.nextInt();
        int check = n;
        int rev = 0;
        for (int i = n; i > 0; i = i / 10) {
            n = i % 10;
            rev = rev * 10 + n;

        }
        if (check == rev) {
            System.out.println(check + ": is a Plandrome Number");
        } else {
            System.out.println(check + ": is Not a Plandrome Number");
        }
    }
}
