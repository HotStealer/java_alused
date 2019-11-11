package Week4;

import java.util.ArrayList;

public class CombiningLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(4);
        list1.add(3);

        list2.add(5);
        list2.add(10);
        list2.add(7);

        combine(list1, list2);

        System.out.println(list2);
    }

    private static void combine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list2.addAll(list1);
    }
}
