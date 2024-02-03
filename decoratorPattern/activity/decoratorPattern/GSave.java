package activity.decoratorPattern;

public class GSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public GSave(SavingsAccount account) {
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
        return 0.025;
    }

    @Override
    public Double computeBalanceWithInterest() {
        return getBalance() + (getBalance()*getInterestRate());
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + " & GCash transfer";
    }


    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
