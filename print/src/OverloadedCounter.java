public class OverloadedCounter {
    public int startingValue;
    public boolean check;

    public OverloadedCounter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }
    public OverloadedCounter(int startingValue) {
        this.startingValue = startingValue;
        this.check = true;
    }
    public OverloadedCounter(boolean check) {
        this.startingValue = 0;
        this.check = check;
    }
    public OverloadedCounter() {
        this.startingValue = 0;
        this.check = true;
    }

    public int value() {
        return this.startingValue;
    }
    public void increase(int increaseAmount) {
        this.startingValue += increaseAmount;
    }
    public void decrease(int decreaseAmount) {
        if (check && (startingValue - decreaseAmount) < 0) {
            startingValue = 0;
        }
        else {
            this.startingValue -= decreaseAmount;
        }
    }

    public static void main(String[] args) {
        OverloadedCounter m = new OverloadedCounter(7,true);
        System.out.println(m.value());
        m.decrease(9);
        System.out.println(m.value());
        m.increase(5);
        System.out.println(m.value());
        System.out.println("-----------");

        OverloadedCounter i = new OverloadedCounter(7);
        System.out.println(i.value());
        i.decrease(9);
        System.out.println(i.value());
        i.increase(5);
        System.out.println(i.value());
        System.out.println("-----------");

        OverloadedCounter f = new OverloadedCounter(false);
        System.out.println(f.value());
        f.decrease(2);
        System.out.println(f.value());
        f.increase(3);
        System.out.println(f.value());
        System.out.println("-----------");

        OverloadedCounter s = new OverloadedCounter();
        System.out.println(s.value());
        s.increase(1);
        System.out.println(s.value());
        s.decrease(3);
        System.out.println(s.value());
        s.decrease(3);
        System.out.println(s.value());
        s.increase(9);
        System.out.println(s.value());

    }
}