package fondamentaux;

import java.util.HashMap;
import java.util.Scanner;

public class TpanagrameFunct {

    public static String anagramme(String texteA, String texteB) {
        // Creation d'une map cle-valeur qui correspond à <lettre, occurence> pour les 2 textes
        HashMap<Character, Integer> occurencesLetters1 = new HashMap<>();
        HashMap<Character, Integer> occurencesLetters2 = new HashMap<>();
        String texte1 = texteA.replace("[^A-Za-z]", "").toLowerCase();
        String texte2 = texteB.replace("[^A-Za-z]", "").toLowerCase();

        //texte1
        for (int i = 0; i < texte1.length(); i++) {
                if (occurencesLetters1.containsKey(texte1.charAt(i)) == true) {
                    int ancienneValeur = occurencesLetters1.get(texte1.charAt(i)) + 1;
                    occurencesLetters1.replace(texte1.charAt(i), ancienneValeur);
                    // System.out.printf("key= %c ; val= %d\n", texte1.charAt(i), ancienneValeur);
                } else {
                    occurencesLetters1.put(texte1.charAt(i), 1);
                    // System.out.printf("i= %d  et key=%c  et value=%d\n", i, texte1.charAt(i), occurencesLetters1.get(texte1.charAt(i)));
                }
        }
        // System.out.println("Debut de l'analyse du texte2");
        //texte 2
        for (int i = 0; i < texte2.length(); i++) {
                if (occurencesLetters2.containsKey(texte2.charAt(i)) == true) {
                    int ancienneValeur = occurencesLetters2.get(texte2.charAt(i)) + 1;
                    occurencesLetters2.replace(texte2.charAt(i), ancienneValeur);
                    //System.out.printf("key= %c ; val= %d\n", texte2.charAt(i), ancienneValeur);
                } else {
                    occurencesLetters2.put(texte2.charAt(i), 1);
                    //System.out.printf("i= %d  et key=%c  et value=%d\n", i, texte2.charAt(i), occurencesLetters2.get(texte2.charAt(i)));
                }
        }

//Test d'égalite
        String resultat = " ";
        boolean egalite = occurencesLetters1.equals(occurencesLetters2) ? true : false;
        if (egalite == true) {
            resultat= "Les 2 textes sont des anagrammes";
        } else {
            resultat = "Les 2 textes ne sont pas des anagrammes";
        }

        return resultat;
    }
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez un texte: ");
        String t1 = input.nextLine();
        System.out.println("Entrez un autre texte: ");
        String t2 = input.nextLine();

       String resultAna= anagramme(t1,t2);
        System.out.println(resultAna);
    }
}
