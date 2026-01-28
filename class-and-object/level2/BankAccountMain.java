package level2;

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Sasi Kiran", "ACC12345", 5000);

        account.deposit(2000);
        account.withdraw(1500);
        account.displayBalance();
    }
}

