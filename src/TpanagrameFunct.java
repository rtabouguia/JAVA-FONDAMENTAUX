import java.util.HashMap;

public class Tpanagrame_funct {

    public static String anagramme(String texte1, String texte2) {
        // Creation d'une map cle-valeur qui correspond à <lettre, occurence> pour les 2 textes
        HashMap<Character, Integer> occurencesLetters1 = new HashMap<>();
        HashMap<Character, Integer> occurencesLetters2 = new HashMap<>();

        //texte1
        for (int i = 0; i < texte1.length(); i++) {
            if (texte1.charAt(i) != ' ') {
                if (occurencesLetters1.containsKey(texte1.charAt(i)) == true) {
                    int ancienneValeur = occurencesLetters1.get(texte1.charAt(i)) + 1;
                    occurencesLetters1.replace(texte1.charAt(i), ancienneValeur);
                    // System.out.printf("key= %c ; val= %d\n", texte1.charAt(i), ancienneValeur);
                } else {
                    occurencesLetters1.put(texte1.charAt(i), 1);
                    // System.out.printf("i= %d  et key=%c  et value=%d\n", i, texte1.charAt(i), occurencesLetters1.get(texte1.charAt(i)));
                }
            }
        }
        // System.out.println("Debut de l'analyse du texte2");
        //texte 2
        for (int i = 0; i < texte2.length(); i++) {
            if (texte2.charAt(i) != ' ') {
                if (occurencesLetters2.containsKey(texte2.charAt(i)) == true) {
                    int ancienneValeur = occurencesLetters2.get(texte2.charAt(i)) + 1;
                    occurencesLetters2.replace(texte2.charAt(i), ancienneValeur);
                    //System.out.printf("key= %c ; val= %d\n", texte2.charAt(i), ancienneValeur);
                } else {
                    occurencesLetters2.put(texte2.charAt(i), 1);
                    //System.out.printf("i= %d  et key=%c  et value=%d\n", i, texte2.charAt(i), occurencesLetters2.get(texte2.charAt(i)));
                }
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
       String resultAna= anagramme("gare", "RAGE");
        System.out.println(resultAna);
    }
}
