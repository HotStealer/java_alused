import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int y = Integer.parseInt(reader.nextLine());
        if (y % 2 == 0){
            System.out.print("Number " + y +" is even");
        } else {
            System.out.print("Number " + y +" is odd");
        }
    }
}
