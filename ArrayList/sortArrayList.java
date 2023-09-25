package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sortArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> data = new ArrayList<>();
        data.add(5);
        data.add(3);
        data.add(1);
        data.add(2);
        data.add(4);

        System.out.println(data);

        // Accending order sort
        // Accending order sort

        Collections.sort(data);
        System.out.println(data);

        // Desending order sort
        // Desending order sort

        System.out.println("\n");

        System.out.println(data);

        Collections.sort(data, Collections.reverseOrder());
        System.out.println(data);
    }
}
