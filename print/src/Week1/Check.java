package Week1;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How old are you: ");
        int y = Integer.parseInt(reader.nextLine());
        if (y < 0 || y > 120){
            System.out.print("Impossible");
        } else  {
            System.out.print("OK");
        }

    }
}
