public class FindAllDuplicateInArray {

    static int[] findAllDuplicates(int data[]) {
        int n = data.length;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (data[i] == data[j]) {
                    ans[i] = data[i];
                    ans[i] = data[j];
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {

        int data[] = { 1, 2, 3, 4, 5, 1, 3, 6, 5 };

        int ans[] = findAllDuplicates(data);
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] > 0) {
                System.out.print(ans[i] + "\t");

            }
        }
    }
}
