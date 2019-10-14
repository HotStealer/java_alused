package Week3;

import java.util.Scanner;

public class SeparatingChar {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int f = name.length();
        int i = 0;
        while (f > i) {
            char letter = name.charAt(i);
            i++;
            System.out.println(i + ". character: " + letter);
        }
    }
}