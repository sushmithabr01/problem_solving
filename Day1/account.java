class BankAccount {
    private String accountHolder;
    private double balance;

    public void setAccountHolder(String name) {
        accountHolder = name;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Invalid deposit");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class account {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.setAccountHolder("Sushmitha");
        b.setBalance(5000);

        b.setBalance(-1000);

        b.deposit(1000);
        b.withdraw(7000);

        System.out.println("Account Holder: Sushmitha");
        System.out.println("Balance: " + b.getBalance());
    }
}
