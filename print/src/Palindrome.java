import java.util.Scanner;

public class Palindrome {
    public static boolean palindrome(String text) {
        int i = text.length();
        int a = text.length() - 1;
        StringBuilder word = new StringBuilder();
        while (i > 0) {
            String letter = text.substring(a, i);
            word.append(letter);
            i--;
            a--;
        }
        if (text.equals(word.toString())){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
