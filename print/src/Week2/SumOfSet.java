package Week2;

import java.util.Scanner;

public class SumOfSet {
    public static void main(String[] args) {
        int start = 1;

        System.out.print("Until what? ");
        Scanner read2 = new Scanner(System.in);
        int stop = Integer.parseInt(read2.nextLine());

        int count = 0;
        while (start <= stop) {
            count += start;
            start++;
        }
        System.out.println("The sum is " + count);
    }
}
