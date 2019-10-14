package Week3;

import java.util.Scanner;

public class LastCharacter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        char letter = lastCharacter(name);
        System.out.println("Last character: " + letter);

    }

    private static char lastCharacter(String name) {
        char w = name.charAt(name.length()-1);
        return w;
    }
}
