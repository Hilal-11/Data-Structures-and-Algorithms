public class changeArrayOddAndEvenIndexes {
    public static void main(String[] args) {

        int data[] = { 10, 4, 3, 7, 9, 8, 16 };
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 0) {
                data[i] = data[i] + 10;
            } else {
                data[i] = data[i] * 2;
            }
        }
        System.out.println("\n");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
    }
}
