package Week2;

import java.util.Scanner;

public class UpTo {
    public static void main(String[] args) {
        int number = 1;
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number: ");
        int y = Integer.parseInt(reader.nextLine());

        while (number <= y) {
            System.out.println(number);
            number++;
        }
    }
}
