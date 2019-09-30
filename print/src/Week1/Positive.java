package Week1;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your age: ");
        int y = Integer.parseInt(reader.nextLine());
        if (y > 0){
            System.out.print("The number is positive");
        } else {
            System.out.print("The number is negative");
        }
    }
}
