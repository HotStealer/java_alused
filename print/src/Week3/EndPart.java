package Week3;

import java.util.Scanner;

public class EndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String name = reader.nextLine();
        int end = name.length();
        System.out.println("Length of the end part: ");
        int number = Integer.parseInt(reader.nextLine());
        int start = name.length() - number;
        System.out.println(name.substring(start, end));
    }
}
