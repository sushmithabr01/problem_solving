class Account {
    int accountNumber;

    void showAccount() {
        System.out.println("Account Number: " + accountNumber);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    void showSavingsDetails() {
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class FixedDepositAccount extends SavingsAccount {
    int lockInYears;

    void showFDDetails() {
        System.out.println("Lock-in Period: " + lockInYears + " years");
    }
}

public class accunt {
    public static void main(String[] args) {
        FixedDepositAccount fd = new FixedDepositAccount();

        fd.accountNumber = 12345;
        fd.interestRate = 7.5;
        fd.lockInYears = 5;

        fd.showAccount();
        fd.showSavingsDetails();
        fd.showFDDetails();
    }
}
