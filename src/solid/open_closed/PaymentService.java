package solid.open_closed;

public class PaymentService {

    private IPaymentMethod paymentMethod;

    public PaymentService(IPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    public void pay(){
        paymentMethod.processPayment();
    }
}
//SOLID
// S : Single responsability
// O : Open closed
// L : Liscov substitution
// I : Interface Segration
// D : Dependency inversion(implémenté par le pattern Dependency Injection)