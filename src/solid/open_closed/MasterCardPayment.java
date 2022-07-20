package solid.open_closed;

public class MasterCardPayment implements IPaymentMethod{

    @Override
    public void processPayment() {
        System.out.println("Paiement par Master card en cours...");
    }
}
