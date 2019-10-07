public class Average {
    public static void main(String[] args) {
        double answer = average(4, 3, 6, 1);
        System.out.println("Average: " + answer);
    }

    private static double average(int i, int i1, int i2, int i3) {
        int sum = i + i1 + i2 + i3;
        return (double)sum/4;
    }
}
