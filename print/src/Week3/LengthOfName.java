package Week3;

import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int length = calculateCharacters(name);
        System.out.println("Number of characters: "+ length);

    }

    private static int calculateCharacters(String name) {
        return name.length();
    }
}
