import java.util.Scanner;

public class Bigger {
    public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Type a first number: ");
            int y = Integer.parseInt(reader.nextLine());
            System.out.print("Type a second number: ");
            int x = Integer.parseInt(reader.nextLine());
            System.out.println("The bigger number of the two numbers given was: " + Math.max(x, y));
    }
}
