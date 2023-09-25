package SortungAlgorithms;

public class LexicographicalOrder {

    static void SortFruits(String[] fruits) {
        int n = fruits.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < n; j++) {

                if (fruits[j].compareTo(fruits[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            String temp = fruits[i];
            fruits[i] = fruits[minIndex];
            fruits[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        String[] fruits = { "papaya", "mango", "watermelon", "kiwi", "orange", "lime", "apple" };
        System.out.print("Unsorted::   ");
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + "\t");
        }
        System.out.println("\n");
        SortFruits(fruits);
        System.out.print("Sorted::   ");
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + "\t");
        }

    }
}
