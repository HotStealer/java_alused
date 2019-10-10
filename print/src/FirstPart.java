import java.util.Scanner;

public class FirstPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String name = reader.nextLine();
        System.out.println("Length of the first part: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println(name.substring(0, number));
    }
}
