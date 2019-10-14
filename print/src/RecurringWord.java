import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
                if (words.contains(word)) {
                    System.out.println("You typed the following word " + word + " twice.");
                    break;
                }

            words.add(word);


        }
    }
}
