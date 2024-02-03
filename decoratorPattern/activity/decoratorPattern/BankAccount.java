package activity.decoratorPattern;

public interface BankAccount {
    String showInfo();
    String showAccountType();
    Double getBalance();
    Double getInterestRate();
    Double computeBalanceWithInterest();
    String showBenefits();
}
