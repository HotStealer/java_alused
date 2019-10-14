import java.util.ArrayList;

public class AverageOfList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(7);
        System.out.println("The average is: " + average(list));
    }

    private static double average(ArrayList<Integer> list) {
        int sum = 0;
        int i = 0;
        for( Integer number : list){
            sum = sum+ number;
            i++;
        }
        double average = (double)sum/i++;
        return average;
    }
}
