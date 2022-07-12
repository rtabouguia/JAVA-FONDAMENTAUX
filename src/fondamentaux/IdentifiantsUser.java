package fondamentaux;

import java.util.Scanner;

public class IdentifiantsUser {
    public static void main(String[] args) {

        //Ce programme demande à l'utilisateur son email et son mot de passe,
        //vérifie les informations pour ensuite le connecter


        //Page de creation de compte
        Scanner input = new Scanner(System.in);
        System.out.print("Veuillez saisir un email valide : ");
        String email = input.nextLine();

        System.out.print("Veuillez définir un mot de passe: ");
        String motDePasse = input.nextLine();
        int nbTentatives = 0;
        while(true){
        //Page de connexion de l'utilisateur
            System.out.print("Veuillez saisir votre email : ");
            String emailATester = input.nextLine();

            System.out.print("Veuillez saisir votre mot de passe: ");
            String motDePasseATester = input.nextLine();
            nbTentatives = nbTentatives+1;
            if(motDePasseATester.equals(motDePasse) && emailATester.equals(email)){
                System.out.println("Bienvenu dans votre espace client");
                break;
            }
            else if(nbTentatives < 5) {

                System.out.println("Identifiants incorrects, veuillez réessayer!");
                System.out.printf("Il vous reste %d tentatives\n", 5-nbTentatives);
            }
            else {
                System.out.printf("Vous avez saisi des mauvais identifiants 5 fois, votre compte est bloqué !");
                break;
            }

        }
    }
}
