package second;

public class CreditCard {
    String cardNumber;
    double balance;

    public CreditCard(String cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Card number: " + cardNumber + ", Balance: " + balance);
    }
}
