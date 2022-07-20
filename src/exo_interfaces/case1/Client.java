package exo_interfaces.case1;

public class Client {
    enum typePaiement {
        VISA,
        MASTER_CARD,
        PAYPAL;
    }


    public void processPayment(){
        typePaiement typePay = typePaiement.VISA;
        switch (typePay){

        case VISA:
            System.out.println("Paiement par carte visa en cours");
        case MASTER_CARD:
            System.out.println("Paiement par master card en cours");

        case PAYPAL :
            System.out.println("Paiement par paypal en cours");

        default:
            System.out.println("Incorrect input");
        }
    }

}
