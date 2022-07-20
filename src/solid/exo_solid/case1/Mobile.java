package solid.exo_solid.case1;

public class Mobile implements IEnvoyerNotif{
    private String numContact;

    public Mobile(String content, String numContact) {

        this.numContact = numContact;
    }


    @Override
    public void sendOTP(String message) {

    }

    @Override
    public void sendTransactionReport(String message) {

    }
}
