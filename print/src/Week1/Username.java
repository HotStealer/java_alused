package Week1;

import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Username: ");
        String y = reader.nextLine();
        System.out.print("Password: ");
        String x = reader.nextLine();
        if (y.equals("alex") && x.equals("mightyducks")  || y.equals("emily") && x.equals("cat")){
            System.out.print("You are now logged into the system");
        } else  {
            System.out.print("Your username or password was invalid");
        }

    }
}
