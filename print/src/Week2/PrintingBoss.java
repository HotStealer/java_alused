package Week2;

public class PrintingBoss {
    public static void main(String[] args) {

        xmasTree(20);
    }

    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
            if (i>1) {
                System.out.print("*");
            }
        }
        System.out.println("");
    }
    public static void printWhitespaces(int size) {
        int i = 0;
        while (i < size) {
            System.out.print(" ");
            i++;
        }
        //System.out.println("");
    }
    public static void xmasTree(int height) {
        int i = height;
        int j = 0;
        while (i >= 0) {
            printWhitespaces(height-j);
            printStars(height-i);
            i--;
            j++;
        }
        printWhitespaces(height - 2);
        printStars(2);
        printWhitespaces(height -2);
        printStars(2);
    }

}