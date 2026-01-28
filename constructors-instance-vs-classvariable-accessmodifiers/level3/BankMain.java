package level3;

public class BankMain {

    public static void main(String[] args) {

        SavingsAccount account =
                new SavingsAccount("ACC123", "Sasi Kiran", 10000);

        account.setBalance(12000);
        account.displayAccountDetails();
    }
}

