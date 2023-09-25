public class twoSum {

    static int[] twoSum(int data[], int target) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] + data[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {

        int data[] = { 1, 2, 3, 3, 1, 4 };
        int targer = 6;

        int ans[] = twoSum(data, targer);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
