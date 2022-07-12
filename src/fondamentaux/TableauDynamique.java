package fondamentaux;

import java.util.ArrayList;

public class TableauDynamique {
    public static void main(String[] args) {
        ArrayList<Integer> notes = new ArrayList<>();
        System.out.println("1 : Taille du tableau ==>"+notes.size());
        notes.add(15);  // la method add() ajoute un element en fin de liste
        notes.add(17);
        notes.add(12);
        notes.add(14);
        System.out.println("2 : Taille du tableau ==>"+notes.size());

    }
}
