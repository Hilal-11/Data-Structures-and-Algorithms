public class OddMax_EvenMax_OddMin_EvenMin {
    public static void main(String[] args) {

        int data[] = { 5, 7, 8, 9, 11, 10, 8, 6, 3, 1 };
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }

        int Evenmax = Integer.MIN_VALUE;
        int Oddmax = Integer.MIN_VALUE;
        int Evenmin = Integer.MAX_VALUE;
        int Oddmin = Integer.MAX_VALUE;

        for (int i = 0; i < data.length; i++) {
            if (data[i] > Evenmax && data[i] % 2 == 0) {
                Evenmax = data[i];
            }

            if (data[i] > Oddmax && data[i] % 2 != 0) {
                Oddmax = data[i];
            }

            if (data[i] < Evenmin && data[i] % 2 == 0) {
                Evenmin = data[i];
            }
            if (data[i] < Oddmin && data[i] % 2 != 0) {
                Oddmin = data[i];
            }
        }

        System.out.println();
        System.out.println("Even Maximum value : " + Evenmax);
        System.out.println("Odd Maximum value : " + Oddmax);
        System.out.println();
        System.out.println("Even Minimum value : " + Evenmin);
        System.out.println("Odd Minimum value : " + Oddmin);

    }
}
