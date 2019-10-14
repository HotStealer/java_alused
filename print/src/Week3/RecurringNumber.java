package Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class RecurringNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once.");
        }
    }

    private static boolean moreThanOnce(ArrayList<Integer> list, int number) {
        int i = 0;
        int a = 0;
        for (int item : list) {
            if (number == item) {
                i++;
                        if(i == 2){
                            a = 1;
                        }
            }
        }
        if (a == 1){
            return true;
        } else {
            return false;
        }
    }
}
