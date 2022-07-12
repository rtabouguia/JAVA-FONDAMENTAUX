package fondamentaux;

import java.util.Scanner;

public class TP25ValidChain {

    //methode qui recoit une chaine, un min et un max
    // et teste si la taille de la chaine est comprise entre min et max

    public static int testChainLength(String chaine, int min, int max){
        int validy =0;
        validy =(chaine.length()<min || chaine.length()>max)?0:1;
        return validy;
    }

    //cette methode permet à l'utilisateur de créer un compte avec des informations d'entrée
    public static String createAccount(){
        //String pseudo, String name, String surname, String mdp, String email
        String infos ="";
        boolean validityInfos =false;
        Scanner input = new Scanner(System.in);
        String pseudo ="";
        while(validityInfos ==false){
            System.out.println("Definissez un pseudo: ");
            pseudo = input.nextLine();
            System.out.println("Entrez votre nom: ");
            String name = input.nextLine();
            System.out.println("Entrez votre prenom: ");
            String surname = input.nextLine();
            System.out.println("Entrez votre mot de passe: ");
            String mdp = input.nextLine();
            System.out.println("Entrez votre adresse email: ");
            String email = input.nextLine();

            int pseudoValidity = testChainLength(pseudo,5,10);
            int nameValidity = testChainLength(name, 4, 30);
            int surnameValidity = testChainLength(surname,2, 30);
            int mdpValidity = testChainLength(mdp, 8, 50);
            boolean emailValidity = email.contains("@");
            validityInfos = (pseudoValidity==1 && nameValidity==1 && surnameValidity==1
                    && mdpValidity==1 && emailValidity==true);

            if(validityInfos==false){
                System.out.println("Les informations que vous avez rentré ne respectent pas les contraintes!");
            }

        }
        infos = String.format("Feliciations %s votre compte a été cree", pseudo );

        return infos;
    }
    public static void main(String[] args) {
        System.out.println(createAccount());
    }
}
