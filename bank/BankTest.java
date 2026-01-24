package bank;

public class BankTest {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(1000.0);

        account.deposit(500.0);
        System.out.println("Balance: " + account.getBalance());

        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}
