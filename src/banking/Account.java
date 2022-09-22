package banking;

public class Account {

    int accountNumber;
    String accountName;
    double accountBalance;

    public Account(int accountNumber, String accountName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public void deposit (double amount) {
        if (amount > 0) {
            accountBalance += amount;
        }
    }

    public void withdraw (double amount) {
        if (amount > 0) {
            accountBalance -= amount;
        }
    }

    

}
