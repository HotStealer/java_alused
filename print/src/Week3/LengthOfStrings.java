package Week3;

import java.util.ArrayList;

public class LengthOfStrings {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Tere");
        list.add("Väike");
        list.add("Martin Horn");
        list.add("Yup");
        ArrayList<Integer> lengths = lengths(list);
        System.out.println("The lengths of Strings: " + lengths);
    }

    private static ArrayList<Integer> lengths(ArrayList<String> list) {
        int number = 0;
        ArrayList<Integer> length = new ArrayList<>();
        for( String word : list){
            number = word.length();
            length.add(number);
        }
        return length;
    }
}
