package level3;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    public void displayAccountDetails() {
        System.out.println("Account No   : " + accountNumber);  // public
        System.out.println("Account Holder: " + accountHolder); // protected
        System.out.println("Balance      : " + getBalance());   // private via method
    }
}

