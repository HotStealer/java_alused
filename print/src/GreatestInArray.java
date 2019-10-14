import java.util.ArrayList;

public class GreatestInArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(11);
        list.add(4);
        list.add(5);
        System.out.println("The greatest number is: " + greatest(list));
    }

    private static Integer greatest(ArrayList<Integer> list) {
        int biggest = 0;
        for (Integer number : list) {
            if (number > biggest) {
                biggest = number;
            }
        }
        return biggest;
    }
}
