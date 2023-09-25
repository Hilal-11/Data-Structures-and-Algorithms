public class OccreancesArray {

    static int occreancesArray(int data[], int n) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == n) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int n = 5;
        int data[] = { 5, 6, 0, 8, 7, 11, 5, 7, 22, 5 };

        System.out.println(occreancesArray(data, n));

    }
}
