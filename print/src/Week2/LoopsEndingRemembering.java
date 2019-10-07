package Week2;

import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number;
        number = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int count = 0;
        int evencount = 0;
        int unevencount = 0;
        while (true) {
            if (number != -1) {
                sum = sum + number;
                count++ ;
                evencount = number % 2 == 0 ? evencount++ : unevencount++;
                number = Integer.parseInt(reader.nextLine());
            } else {
                System.out.println("The sum is "+ sum);
                System.out.println("How many number: "+count);
                System.out.println("Average: " + sum/count);
                System.out.println("Even numbers: " + evencount);
                System.out.println("Odd numbers: " + unevencount);
                System.out.println("Thank you and see you later!");
                break;
            }

        }
    }
}
