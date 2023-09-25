public class LastOccurrence {

    static int lastOccurrence(int data[], int x) {
        int lastIndex = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        int x = 5;
        int data[] = { 4, 5, 6, 9, 11, 5, 6, 7, 8, 5 };
        System.out.println(lastOccurrence(data, x));
    }
}
