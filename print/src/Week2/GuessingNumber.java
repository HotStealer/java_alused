package Week2;

import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int guess = Integer.parseInt(reader.nextLine());
        int count = 0;
        System.out.println(number);
        while (true) {
            if (guess > number) {
                count++;
                System.out.println("The number is lesser, guesses made: "+ count);
                guess = Integer.parseInt(reader.nextLine());
            } else if (guess < number) {
                count++;
                System.out.println("The number is greater, guesses made: "+ count);
                guess = Integer.parseInt(reader.nextLine());
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }

    }
}
