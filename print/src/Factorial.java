import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Type a number: ");
        Scanner read1 = new Scanner(System.in);
        int number = Integer.parseInt(read1.nextLine());

        int res = 1;
        while (number >= 1) {
            res *= number;
            number--;
        }
        System.out.println("The factorial is " + res);
    }
}
