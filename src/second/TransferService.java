package second;

public class TransferService {
    public void deposit(CreditCard card, double amount) {
        if (amount < 0)
            System.out.println("Invalid amount. Deposit should be greater than 0");
        card.balance += amount;
        System.out.println("Deposited: " + amount + " to credit card " + card.cardNumber);
    }

    public void withdraw(CreditCard card, double amount) {
        if (amount <= 0)
            System.out.println("Invalid amount. Withdrawal should be greater than 0");
        if (card.balance < amount)
            System.out.println("Insufficient funds for withdrawal from account " + card.cardNumber);
        card.balance -= amount;
        System.out.println("Withdrew " + amount + " from credit card " + card.cardNumber);
    }
}
