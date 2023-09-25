import java.util.Scanner;

public class Ask_n_QuriesQuestions {

    static int[] makeFrequencyArray(int[] data) {

        int[] freq = new int[100005];
        for (int i = 0; i < data.length; i++) {
            freq[data[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = input.nextInt();
        int[] data = new int[n];

        System.out.print("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            data[i] = input.nextInt();
        }

        int[] freq = makeFrequencyArray(data);

        System.out.print("Enter number of Quries : ");
        int q = input.nextInt();
        while (q > 0) {
            System.out.print("Enter number to the Searching : ");
            int x = input.nextInt();
            if (freq[x] > 0) {
                System.out.println("YES " + x + " is Present in Array");
            } else {
                System.out.println("NO " + x + " is Not Present in Array");
            }
            q--;
        }
        System.out.println();
        System.out.println("Quries Limit is End Stop");
        System.out.println();

    }
}
