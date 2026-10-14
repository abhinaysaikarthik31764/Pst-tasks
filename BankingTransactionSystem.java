import java.util.Scanner;

class BankAccount {
    private int balance = 0;

    void deposit(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative");
        balance += amount;
    }

    void withdraw(int amount) {
        if (amount < 0 || amount > balance)
            throw new IllegalArgumentException("Invalid withdrawal");
        balance -= amount;
    }

    int getBalance() {
        return balance;
    }
}

public class BankingTransactionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String operation = sc.next();
            int amount = sc.nextInt();
            if (operation.equalsIgnoreCase("Deposit")) {
                account.deposit(amount);
            } else if (operation.equalsIgnoreCase("Withdraw")) {
                account.withdraw(amount);
            }
        }

        System.out.println(account.getBalance());
        sc.close();
    }
}
