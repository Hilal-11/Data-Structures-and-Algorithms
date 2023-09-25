public class countElementsGreaterThanX {

    static int countElements(int data[], int x) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > x) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int x = 5;
        int data[] = { 4, 2, 3, 6, 5, 11, 44, 666, 66, 88 };
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println("\n");
        System.out.println(countElements(data, x));

    }
}
