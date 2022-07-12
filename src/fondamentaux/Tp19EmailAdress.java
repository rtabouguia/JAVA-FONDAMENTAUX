package fondamentaux;

import java.util.HashMap;
import java.util.Map;

public class Tp19EmailAdress {
    public static void main(String[] args) {

        String [] emailTab = {"christian.lisangola@gmail.com", "jean.paul@gmail.com",
                "alain@gmail.com", "lydie@yahoo.fr", "josephine.lajoie@yahoo.com",
                "luise@hotmail.fr", "philemon.turion@gmail.com", "jules.cesar@hotmail.fr"};
        HashMap<String, Double> emailPercent = new HashMap<>();
        double gmail = 0;
        double yahoo = 0;
        double hotmail = 0;
        for(String email: emailTab){
            String [] emailSplitted = email.split("@");
            System.out.println(emailSplitted[1]);
            ;
            if (emailSplitted[1].contains("gmail")){
                gmail =gmail+1;
                emailPercent.put("gmail.com", (gmail/emailTab.length)*100);
            }
            else if (emailSplitted[1].contains("yahoo")){
                yahoo =yahoo+1;
                emailPercent.put("yahoo", (yahoo/emailTab.length)*100);
            }
            if (emailSplitted[1].contains("hotmail")){
                hotmail =hotmail+1;
                emailPercent.put("hotmail", (hotmail/emailTab.length)*100);
            }

        }
        //Map.Entry<Integer, String> entry : customers.entrySet()
        for(HashMap.Entry<String, Double> entry : emailPercent.entrySet()){
            System.out.printf("Taux d'adresse %s: %.2f\n", entry.getKey(), entry.getValue());

        }

    }
}
