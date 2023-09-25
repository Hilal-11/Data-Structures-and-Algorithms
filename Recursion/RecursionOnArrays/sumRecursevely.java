package RecursionOnArrays;

public class sumRecursevely {

    static int sumRecursevely(int data[], int i) {
        int n = data.length;
        if (i == n - 1) {
            return data[i];
        }

        int smallAns = sumRecursevely(data, i + 1);
        return data[i] + smallAns;
    }

    public static void main(String[] args) {
        int data[] = { 1, 2, 3, 4, 5 };
        System.out.println("Sum :- " + sumRecursevely(data, 0));
    }
}
