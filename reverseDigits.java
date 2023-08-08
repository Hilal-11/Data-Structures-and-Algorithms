import java.util.Scanner;

public class reverseDigits {

    public static int reverse(int num) {
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        return reverse;
    }

    // public static int reverse(int num) {
    // int reverse = 0;
    // for (int i = num; i > 0;) {
    // num = i % 10;
    // reverse = reverse * 10 + num;
    // i = i / 10;
    // }
    // return reverse;
    // }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of num1 :- ");
        int num = input.nextInt();

        System.out.println(reverse(num));
    }
}
