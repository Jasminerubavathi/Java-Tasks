
    

interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
}


class BankAccount implements Transaction {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    //@Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    //@Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

 
 class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        
        System.out.println("Initial balance: $" + account.getBalance());
        
        account.deposit(500.0);
        System.out.println("Current balance after deposit: $" + account.getBalance());
        
        account.withdraw(200.0);
        System.out.println("Current balance after withdrawal: $" + account.getBalance());
        
        account.withdraw(1500.0); // This should fail due to insufficient funds
        System.out.println("Current balance after withdrawal: $" + account.getBalance());
    }
}

