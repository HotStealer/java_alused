package Week4;

public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has "+ balance + " euros.";
    }
    public void payEconomical() {
        if(this.balance >= 2.5){
            this.balance = balance - 2.5;
        }
    }

    public void payGourmet() {
        if(this.balance >= 4){
            this.balance = balance - 4;
        }
    }
    public void loadMoney(double amount) {
        if(amount >= 0) {
            this.balance = balance + amount;
        }
    }
}
class Main {
    public static void main(String[] args) {
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

        cardPekka.payGourmet();
        cardBrian.payEconomical();

        System.out.println(cardPekka);
        System.out.println(cardBrian);

        cardPekka.loadMoney(20);
        cardBrian.payGourmet();

        System.out.println(cardPekka);
        System.out.println(cardBrian);

        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);

        System.out.println(cardPekka);
        System.out.println(cardBrian);
    }
}