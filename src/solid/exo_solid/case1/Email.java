package solid.exo_solid.case1;

public class Email implements IEnvoyerNotif{
    private String email;

    public Email(String content, String email){
        this.email=email;
    }


    @Override
    public void sendOTP(String message) {

    }

    @Override
    public void sendTransactionReport(String message) {

    }
}
