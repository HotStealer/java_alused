package Week2;

public class Printing {
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);

        printSquare(4);

        printRectangle(17, 3);

        printTriangle(4);
    }

    private static void printTriangle(int size) {
        int i = size;
        int j = 0;
        while(i >= 0){
            printWhitespaces(size-j);
            printStars(size-i);
            i--;
            j++;
        }
    }

    private static void printWhitespaces(int size) {
        int i = 0;
        while ( i < size ) {
            System.out.print("");
            i++;
        }
    }

    private static void printRectangle(int w, int l) {
        int i = 0;
        while (i < l) {
            printStars(w);
            i++;
        }
        System.out.println("");
    }


    private static void printSquare(int number) {
        int i = 0;
        while (i < number) {
            printStars(number);
            i++;
        }
        System.out.println("");
    }

    private static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }
}
