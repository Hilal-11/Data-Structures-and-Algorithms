public class TargetSum {
    public static void main(String[] args) {

        int x = 5;
        int data[] = { 4, 1, 6, 8, 3, 2 };
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println("\n");
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] + data[j] == x) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
