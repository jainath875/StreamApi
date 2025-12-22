public class Atm {
    private double balance = 5000;
    public void withdrow(double amount) throws InsufficientBalanceException {
        if(amount > balance) {
            throw new InsufficientBalanceException("Balance is to low for withdrowal.");
        }
        balance -= amount;
        System.out.println("withdrowal successfull balance Reamaining: " + balance);
    }
}
