package Week2;

import java.util.Scanner;

public class ManyPrints {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many: ");
        int number = Integer.parseInt(reader.nextLine());
        while(number > 0){
            printText();
            number--;
        }
    }

    private static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
