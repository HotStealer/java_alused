package Week3;

import java.util.Scanner;

public class Reverse {
    public static String reverse(String text) {
        int i = text.length();
        int a = text.length() - 1;
        StringBuilder word = new StringBuilder();
        while (i > 0) {
            String letter = text.substring(a, i);
            word.append(letter);
            i--;
            a--;
        }
        return word.toString();
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }

}
