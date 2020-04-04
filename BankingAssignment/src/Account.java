public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amt) {
        this.balance += amt;
        return true;
    }

    public boolean withdraw(double amt) {
        boolean bool = false;
        if (this.balance >= amt) {
            this.balance -= amt;
            bool = true;
        }
        else {
            System.out.println("Amount withdrawn exceeds the current balance!");
            bool = false;
        }
        return bool;
    }

    @Override
    public String toString() {
        return "Account [balance: " + getBalance() + "]";
    }
}
