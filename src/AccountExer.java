// Program that creates a class Account that stores a variable balance. The class has methods
// to start account, to deposit money, to withdraw money and tell the current balance
// amount.

class Account {
    String name;
    int balance;

    void startAccount(String n) {
        name = n;
        balance = 0;
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("Rs. " + amount + " deposited to Acc. Name: " + name);
    }

    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return;
        }
        balance -= amount;
        System.out.println("Rs. " + amount + " withdrawn from Acc. Name: " + name);
    }

    void currentBalance() {
        System.out.println("Rs. " + balance + " available on Acc. Name: " + name);
    }

}

 class AccountExer {
    public static void main(String[] args) {
        Account a = new Account();
        a.startAccount("Laxmi Chit Fund Pvt. Ltd.");
        a.deposit(500);
        a.withdraw(200);
        a.currentBalance();
    }
}
