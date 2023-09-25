public class SortedOrNot {

    static boolean isSorted(int data[]) {
        boolean check = true;
        for (int i = 1; i < data.length; i++) {
            if (data[i] < data[i - 1]) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {

        int data[] = { 1, 2, 4, 4, 4, 5, 6, 7, 8 };
        System.out.println("Is Sorted : " + isSorted(data));
    }
}
