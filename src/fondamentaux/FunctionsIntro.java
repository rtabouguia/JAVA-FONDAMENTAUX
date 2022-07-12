package fondamentaux;

import java.util.Scanner;

public class FunctionsIntro {
    static int somme(int nombre1, int nombre2){
        int resultat = nombre1+nombre2;
        return resultat;
    }

    static String deleteSpecialChars(String chaine){
        String newStr = chaine.replaceAll("[^A-Za-z]", "").toLowerCase();
        return  newStr;
    }

    public static void main(String[] args) {
        System.out.println(somme(4,5));
        System.out.println(deleteSpecialChars("papy est gentil "));


        //Demande de saisir utilisateur
        Scanner input = new Scanner(System.in);
        System.out.println("Entre les 2 nombres : ");
        int nb1 = input.nextInt();
        int nb2 = input.nextInt();

        System.out.println(somme(nb1, nb2));
    }
}
