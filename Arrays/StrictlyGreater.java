public class StrictlyGreater {

    static int strictlyGreater(int data[], int x) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int x = 5;
        int data[] = { 5, 7, 6, 2, 3, 9, 8, 11, 66 };
        System.out.println(strictlyGreater(data, x));

    }
}
