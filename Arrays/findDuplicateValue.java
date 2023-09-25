public class findDuplicateValue {

    static int findDuplicate(int data[]) {

        int n = data.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (data[i] == data[j]) {
                    ans = data[i];
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int data[] = { 1, 2, 3, 4, 5, 5 };

        int ans = findDuplicate(data);
        System.out.println("Duplicate value : " + ans);
    }
}
