import java.util.Scanner;

public class SumOfPowers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        int i = 0;
        int result = 0;

        while (i <= number) {
            result = result+(int)Math.pow(2,i);
            i++;
        }
        System.out.println("The result is "+ result);
    }
}
