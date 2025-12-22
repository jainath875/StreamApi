
public class ExceptionExample {

    public static void main(String[] args) {
        Atm atm = new Atm();
        try {
            atm.withdrow(400);
        } catch(InsufficientBalanceException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
    
}
