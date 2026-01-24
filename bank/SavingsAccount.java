package bank;

public class SavingsAccount extends BankAccount implements Taxable {
    private static final double SERVICE_TAX_RATE = 0.05; // 5% tax

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        double tax = calculateServiceTax(amount);
        double totalDeduction = amount + tax;

        if (totalDeduction <= balance) {
            balance -= totalDeduction;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Service Tax: " + tax);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    @Override
    public double calculateServiceTax(double amount) {
        return amount * SERVICE_TAX_RATE;
    }
}
