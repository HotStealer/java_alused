package Week3;

import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int i = name.length();
        while (i > 0) {
            char letter = name.charAt(i-1);
            i--;
            System.out.print(letter);
        }
    }
}