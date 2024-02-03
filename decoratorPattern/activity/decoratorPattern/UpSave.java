package activity.decoratorPattern;

public class UpSave implements BankAccountDecorator{
    private BankAccount bankAccount;

    public UpSave(SavingsAccount account) {
        setBankAccount(account);
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }

    @Override
    public String showAccountType() {
        return "Account type: " + getClass().getSimpleName();
    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public Double getInterestRate() {
        return 0.04;
    }

    @Override
    public Double computeBalanceWithInterest() {
        return getBalance() + (getBalance()*getInterestRate());
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + " With Insurance";
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
