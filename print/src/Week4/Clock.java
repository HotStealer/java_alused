package Week4;

import java.util.Scanner;

public class Clock {
    public static class BoundedCounter {
        private int value;
        private int upperLimit;
        private int limit;

        public BoundedCounter(int upperLimit) {
            value = 0;
            limit = upperLimit;
        }
        public int setValue(int number){
            value = number;
            return value;
        }

        public void next() {
            if (value == limit){
                value = 0;
            } else {
                value++;
            }
        }

        public int getValue(){
            return value;
        }

        public String toString() {
            if(value > 9){
                return "" + value;
            } else {
                return "0" + value;
            }

        }
    }
    public static class Main {
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            BoundedCounter seconds = new BoundedCounter(59);
            BoundedCounter minutes = new BoundedCounter(59);
            BoundedCounter hours = new BoundedCounter(23);

            System.out.print("seconds: ");
            int s = Integer.parseInt(reader.nextLine());
            System.out.print("minutes: ");
            int m = Integer.parseInt(reader.nextLine());
            System.out.print("hours: ");
            int h = Integer.parseInt(reader.nextLine());

            seconds.setValue(s);
            minutes.setValue(m);
            hours.setValue(h);

            int i = 0;
            while ( i < 121 ) {
                System.out.println( hours + ":" + minutes + ":" + seconds);// the current time printed
                seconds.next();
                if (seconds.getValue() == 0){
                    minutes.next();
                    if(minutes.getValue() == 0){
                        hours.next();
                    }
                }
                i++;
            }
        }
    }
}


