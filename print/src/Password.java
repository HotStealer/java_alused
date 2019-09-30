import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        while (true) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Type the password: ");
            String pass = reader.nextLine();
             if (pass.equals("carrot")) {
                 System.out.println("Right!");
                 System.out.println("The secret is: jryy qbar!");
                 break;

             } else {
                 System.out.println("Wrong!");
             }
        }
    }
}
