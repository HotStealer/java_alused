import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int y = Integer.parseInt(reader.nextLine());
        System.out.print("Type a second number: ");
        int x = Integer.parseInt(reader.nextLine());
        System.out.println("Sum of the numbers:" + (x+y));
    }
}
