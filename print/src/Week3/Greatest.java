package Week3;

public class Greatest {
    public static void main(String[] args) {
        int answer = greatest(25, 18, 12);
        System.out.println("Greatest: " + answer);
    }

    public static int greatest(int i2, int i, int i1) {
        int first = Math.max(i, i1);
        int second = Math.max(i1, i2);
        return Math.max( first,second);
    }

}