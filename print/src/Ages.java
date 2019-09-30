import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String b = reader.nextLine();
        System.out.print("Type your age: ");
        int y = Integer.parseInt(reader.nextLine());
        System.out.print("Type your name: ");
        String a = reader.nextLine();
        System.out.print("Type your age: ");
        int x = Integer.parseInt(reader.nextLine());
        System.out.println(b + " and " + a + " are " + (x+y) +  " years old in total");
    }
}
