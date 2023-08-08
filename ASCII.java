import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of num1 :- ");
        int n = input.nextInt();

        for (int i = 65; i <= 90; i++) {
            System.out.printf("%c \t", i);
        }
    }
}
