package ArrayManipulation;

public class findUniqueElement {
    static int findUnique(int data[]) {
        int ans = -1;

        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == data[j]) {
                    data[i] = -1;
                    data[j] = -1;

                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                ans = data[i];
                System.out.println(ans);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int data[] = { 1, 2, 3, 4, 4, 5, 2, 3, 1 };
        System.out.println("Unique Element : " + findUnique(data));

    }
}
