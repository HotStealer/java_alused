import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int y = Integer.parseInt(reader.nextLine());
        if (30 > y){
            System.out.print("Grade: failed");
        } else if ( 35 > y){
            System.out.print("Grade: 1");
        } else if ( 40 > y){
            System.out.print("Grade: 2");
        } else if ( 45 > y){
            System.out.print("Grade: 3 ");
        } else if ( 50 > y){
            System.out.print("Grade: 4 ");
        } else {
            System.out.print("Grade: 5 ");
        }

    }
}
