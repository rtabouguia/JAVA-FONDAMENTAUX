package solid.open_closed;

public class VisaCardPaiment implements IPaymentMethod{
    @Override
    public void processPayment() {
        System.out.println("Paiement par Visa en cours...");
    }
}
