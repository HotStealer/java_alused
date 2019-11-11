package Week4;

import java.util.Random;

public class PasswordRandomizer {
    Random number;
    String password;
    int length;

    public PasswordRandomizer(int length) {
        this.length = length;
        return;
    }

    public String createPassword() {
        password = "";
        number = new Random();
        for (int i = 0; i < length; i++){
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number.nextInt(26));
            password += symbol;
        }
        return password;
    }
}
class Password {
    public static void main(String[] args) {
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
    }
}