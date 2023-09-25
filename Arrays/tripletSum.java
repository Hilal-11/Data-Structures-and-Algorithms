public class tripletSum {
    public static void main(String[] args) {

        int x = 12;
        int data[] = { 1, 4, 5, 6, 3 };
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }

        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                for (int k = j + 1; k < data.length; k++) {
                    if (data[i] + data[j] + data[k] == x) {
                        count++;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Total Triplet Sum : " + count);

    }
}
