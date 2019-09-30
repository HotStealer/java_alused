import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first number: ");
        int y = Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number: ");
        int x = Integer.parseInt(reader.nextLine());
        if (x > y){
            System.out.print("Greater number: "+ x);
        } else if ( y > x){
            System.out.print("Greater number: "+ y);
        } else {
            System.out.print("The numbers are equal");
        }

    }
}
