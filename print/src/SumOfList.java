import java.util.ArrayList;

public class SumOfList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(7);
        System.out.println("The sum: " + sum(list));
    }

    private static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for( Integer number : list){
            sum = sum+ number;
        }
        return sum;
    }
}
