package Recursion;

import java.util.Scanner;

public class BasicsOfRecursion {

    static int n = 100;

    // public static void recursion() {
    // if (n > 0) {
    // n--;
    // recursion();
    // }

    // System.out.print("Hilal \t ");
    // }

    // public static void recursion() {
    // if (n >= 0) {
    // n--;
    // recursion();
    // }

    // System.out.print("Hilal \t ");
    // }

    // static int n = 10;

    // public static void recursion() {
    // if (n > 1) {
    // n--;
    // recursion();
    // }
    // System.out.println("Hello World \t");
    // }

    // public static void print5() {
    // System.out.println(5);
    // print4();
    // }

    // public static void print4() {
    // System.out.println(4);
    // print3();
    // }

    // public static void print3() {
    // System.out.println(3);
    // print2();
    // }

    // public static void print2() {
    // System.out.println(2);
    // print1();
    // }

    // public static void print1() {
    // System.out.println(1);
    // }

    // Print 1 to n
    // Print 1 to n

    // static void recursion(int n) {
    // if (n == 0)
    // return;
    // recursion(n - 1);
    // System.out.print(n + "\t");

    // }

    // // Print n to 1
    // // Print n to 1
    // static void recursion2(int n) {
    // if (n == 0)
    // return;
    // System.out.print(n + "\t");
    // recursion2(n - 1);
    // }

    // vary complex and Logical (Bulshet)
    // vary complex and Logical (Bulshet)

    // static void recursion(int n) {
    // if (n == 0)
    // return;

    // recursion(n - 1);
    // System.out.print(n + "\t");
    // recursion(n - 1);
    // }

    // n - 1 && 1 - n
    // n - 1 && 1 - n

    // static void recursion(int n) {
    // if (n == 0)
    // return;
    // System.out.print(n + "\t");
    // recursion(n - 1);
    // System.out.print(n + "\t");
    // }

    // static void recursion(int n) {
    // if (n == 0)
    // return;
    // recursion(n - 1);
    // System.out.print(n + "\t");
    // System.out.print(n + "\t");

    // }

    // static void recursion(int n) {
    // if (n == 0)
    // return;
    // recursion(n - 1);
    // System.out.print(n + "\t");
    // System.out.print(n + "\t");

    // }

    // static int recursionSum(int n) {
    // int sum = 0;
    // if (n == 0)
    // return 0;
    // return n + recursionSum(n - 1);

    // }

    // static int recursionSum(int n) {
    // if (n == 1)
    // return 1;
    // return n + recursionSum(n - 1);

    // }

    // static int recursionSum(int n) {
    // if (n == 1)
    // return n;
    // return n + recursionSum(n - 1);

    // }
    //
    //
    //
    //

    // Factorial of n with recursion
    // Factorial of n with recursion

    // static int factorial(int n) {
    // if (n == 0)
    // return 1;
    // return n * factorial(n - 1);
    // }

    // static int factorial(int n) {
    // if (n == 0)
    // return 1;
    // return n * factorial(n - 1);
    // }

    // Factorial of n with recursion
    // Factorial of n with recursion

    // static int febonacci(int n) {

    // if (n <= 1) {
    // return n;
    // } else {
    // return febonacci(n - 1) + febonacci(n - 2);
    // }

    // }

    // static int febonacci(int n) {

    // if (n == 0) {
    // return 0;
    // } else if (n == 1) {
    // return 1;
    // } else {
    // return febonacci(n - 1) + febonacci(n - 2);
    // }

    // }

    //
    // Types of Recursions
    // Types of Recursions
    //
    //
    //
    // 1 :- direct recursion
    //
    //
    //
    // 2 :- indirect recursion

    // static void fun1() {
    // System.out.println("Function 1");
    // func2();
    // System.out.println("After function 2");
    // }

    // static void func2() {
    // System.out.println("Function 2");
    // }

    // static boolean isEven(int n) {
    // if (n == 0) {
    // return true;
    // } else {
    // return isOdd(n - 1);
    // }
    // }

    // static boolean isOdd(int n) {
    // if (n == 0) {
    // return false;
    // } else {
    // return isEven(n - 1);

    //

    // static void reverse(int n) {
    // if (n < 10) {
    // System.out.print(n);
    // return;
    // } else {
    // System.out.print(n % 10);
    // reverse(n / 10);
    // }
    // }

    // static void reverse(int n) {
    // int reverse = 0;

    // if (n < 10 || n % 10 == 0) {
    // System.out.print(n);
    // return;
    // } else {
    // System.out.print(n % 10);
    // reverse(n / 10);
    // }
    // }

    // static void recursion(int n) {
    // if (n > 0) {
    // for (int i = 0; i < n; i++) {
    // System.out.print("\t" + n);

    // recursion(n - 1);
    // }
    // }
    // }

    // static void recursion(int n) {
    // if (n > 0) {
    // for (int i = 1; i < n; i *= 2) {
    // System.out.print("\t" + n);

    // recursion(n - 1);
    // }
    // }
    // }

    // static int factorial(int n) {
    // if (n == 0)
    // return 1;

    // int smallerProblem = factorial(n - 1);
    // int biggerProblem = n * smallerProblem;
    // return biggerProblem;
    // }
    // static int factorial(int n) {
    // if (n == 0)
    // return 1;

    // return n * factorial(n - 1);
    // }

    // static int power(int n) {
    // if (n == 0)
    // return 1;

    // return 2 * power(n - 1);
    // }

    // static void printing(int n) {
    // if (n == 0)
    // return;

    // System.out.print(n + "\t");
    // printing(n - 1);
    // }

    // static void reachHome(int src, int dest) {
    // System.out.println(src + ": sourse " + dest + " :Destination");
    // if (src == dest) {
    // System.out.println("I reach my Home");
    // return;
    // }
    // reachHome(src + 1, dest);
    // }

    // static int febonacii(int n) {
    // if (n == 0) {
    // return 0;
    // }
    // if (n == 1) {
    // return 1;
    // }
    // return febonacii(n - 1) + febonacii(n - 2);
    // }

    // static int stairPath(int n) {
    // if (n < 0) {
    // return 0;
    // }
    // if (n == 0) {
    // return 1;
    // }

    // return stairPath(n - 1) + stairPath(n - 2);
    // }

    // static int stairPath(int n) {
    // if (n < 0) {
    // return 0;
    // }
    // if (n == 0) {
    // return 1;
    // }
    // if (n == 1) {
    // return 1;
    // }

    // return stairPath(n - 1) + stairPath(n - 2) + stairPath(n - 3);
    // }
    static void sayDigit(int n, String arry[]) {

        if (n == 0) {
            return;
        }

        int digit = n % 10;
        n = n / 10;
        sayDigit(n, arry);
        System.out.print(arry[digit] + "\t");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of n :- ");
        int n = input.nextInt();

        String arry[] = { "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine" };
        sayDigit(n, arry);

        // System.out.println(factorial(n));
        // System.out.println(power(n));

        // printing(n);
        // recursion(n);

        // System.out.println(stairPath(n));

        // recursion(n);
        // System.out.println("\n");
        // recursion2(n);
        // System.out.println("sum = " + recursionSum(n));

        // int src = 1;
        // int dest = 10;

        // reachHome(src, dest);

        // System.out.println(febonacii(n));

        // System.out.println("Factorial : " + factorial(n));
        // System.out.println(febonacci(n));
        // fun1();

        // System.out.println(isEven(n));

        // reverse(n);

        // int rev = 0;

        // while (n > 0) {
        // rev = rev * 10 + n % 10;
        // n = n / 10;
        // }
        // System.out.println("Reverse = " + rev);

    }
}
