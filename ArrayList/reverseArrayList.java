package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class reverseArrayList {

    static void reverseArrayList(ArrayList<Integer> data) {

        int i = 0;
        int j = data.size() - 1;

        while (i < j) {

            Integer temp = Integer.valueOf(data.get(i));
            data.set(i, data.get(j));
            data.set(j, temp);
            i++;
            j--;
        }

    }

    public static void main(String[] args) {

        ArrayList<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);

        System.out.println(data);

        reverseArrayList(data);
        System.out.println(data);

        // System.out.println(data);

        // Collections.reverse(data);
        // System.out.println(data);

    }
}
