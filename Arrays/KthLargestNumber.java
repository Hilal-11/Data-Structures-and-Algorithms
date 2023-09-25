public class KthLargestNumber {

    // find maximum value
    // find maximum value

    static int findMax(int data[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    // find minimum value
    // find minimum value
    static int findMin(int data[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }

        return min;
    }

    // find second maximum value
    // find second maximum value

    static int findSecondMax(int data[]) {
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] > sMax && data[i] < max) {
                sMax = data[i];
            }
        }
        return sMax;
    }

    // find second minimum value
    // find second minimum value

    static int findSecondMin(int data[]) {
        int min = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] < sMin && data[i] > min) {
                sMin = data[i];
            }
        }
        return sMin;

    }

    public static void main(String[] args) {

        int data[] = { 10, 5, 6, 7, 9 };
        System.out.println(findSecondMin(data));
    }
}
