package activity.decoratorPattern;

public class SavingsAccount implements BankAccount {
    private String accountNumber;
    private String accountName;
    private Double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String showInfo() {
        return "Account number: " + getAccountNumber() +
                "\nAccount name: " + getAccountName() +
                "\nBalance: " + getBalance();
    }

    @Override
    public String showAccountType() {
        return "Account type: " + getClass().getSimpleName();
    }

    @Override
    public Double getBalance() {
        return balance;
    }

    @Override
    public Double getInterestRate() {
        return 0.01;
    }

    @Override
    public Double computeBalanceWithInterest() {
        return getBalance() + (getBalance()*getInterestRate());
    }

    @Override
    public String showBenefits() {
        return "Benefits: Standard Savings Account";
    }
}
