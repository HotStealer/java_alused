public class Counter {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
    }
}

class DecreasingCounter {
    private int value;   // object variable that remembers the value of the counter
    private int init;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        init = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (this.value == 0) {
            this.value = 0;
        } else {
            this.value = this.value - 1;
        }
        // write here the code that decrements the value of counter by one
    }

    public void reset() {
        this.value = 0;
    }

    public void setInitial() {
        this.value =  init;
    }

    // and here the rest of the methods
}
