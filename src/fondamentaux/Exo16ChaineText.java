package fondamentaux;

import java.util.Scanner;

public class Exo16ChaineText {
    public static void main(String[] args) {
        //Ce programme demande à l'utlisateur de saisir un texte et ensuite,
        // retourne la chaine inverse

        Scanner input = new Scanner(System.in);
        System.out.println("Entrez un texte");
        String texte = input.nextLine();
        String textInverse = "";

        for (int i= texte.length()-1; i>=0; i--){
             textInverse = textInverse+texte.charAt(i);
        }
        System.out.println(textInverse);
    }
}
