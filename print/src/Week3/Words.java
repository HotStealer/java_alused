package Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String help = "";
        while(true){
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (word.isEmpty()){
                System.out.println("You typed the following words: ");
                System.out.print(help);
                break;
            } else {
                words.add(word);
                help = help + "\n" + word;
            }
        }
    }
}
