class BankAccount {
    private double balance=0; 
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance+ amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance- amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class experiment4_2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        account.deposit(500); 
        account.checkBalance();
    }
}
