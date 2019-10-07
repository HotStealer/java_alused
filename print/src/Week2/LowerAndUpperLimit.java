package Week2;

import java.util.Scanner;

public class LowerAndUpperLimit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("From what number: ");
        int x = Integer.parseInt(reader.nextLine());
        System.out.print("Up to what number: ");
        int y = Integer.parseInt(reader.nextLine());
        System.out.println("First: " + x);
        System.out.println("Last: " +y);
        while (x <= y) {
            System.out.println(x);
            x++;
        }
    }
}

