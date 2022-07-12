package fondamentaux;

import java.util.HashMap;

public class HMapConcept {
    public static void main(String[] args) {
        // A partir d'une phrase, afficher le nombre d'occurence de chaque caractère

        String phrase="Je suis dans une joie immence.Et je sais que c'est aussi le cas " +
                "pour vous";

        String phraseFormatee=phrase.replaceAll("[^A-Za-z]","").toLowerCase();
        System.out.println(phraseFormatee);

        // { j:1, e:2 }
        HashMap<Character,Integer> occurences=new HashMap<>();
        System.out.println(occurences);
        for(int index=0;index<phraseFormatee.length();index++){
            char lettre=phraseFormatee.charAt(index);
            if(occurences.containsKey(lettre)){
                int ancienneValeur=occurences.get(lettre);
                occurences.replace(lettre,ancienneValeur+1);
            }else{
                occurences.put(lettre,1);
            }
        }

        System.out.println(occurences);
    }
}
