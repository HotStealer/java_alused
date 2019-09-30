package Week1;

import java.util.Scanner;

public class Divider {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int y = Integer.parseInt(reader.nextLine());
        System.out.print("Type a second number: ");
        int x = Integer.parseInt(reader.nextLine());
        System.out.println("Division of the numbers:" + (y/x));
    }
}

