import java.util.Scanner;

public class Majority {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How old are you: ");
        int y = Integer.parseInt(reader.nextLine());
        if (y > 17){
            System.out.print("You have reached the age of majority");
        } else {
            System.out.print("You have not reached the age of majority");
        }
    }
}
