package fondamentaux;

public class TableauSuite {
    public static void main(String[] args) {

        //Etudiant s'appelle Jean
        float [] notes = {15.5F, 18.2F, 13.2F, 10, 14.6F};

        //Mauvaise approche pour l'affichage
    //    System.out.println(notes[0]);
    //    System.out.println(notes[1]);
    //    System.out.println(notes[2]);
    //    System.out.println(notes[3]);
    //    System.out.println(notes[4]);

        //Bonne aproche pour l'affichage
        for(int i=0; i<notes.length; i++){
            System.out.println(notes[i]);
        }

        //Calcul de la somme
        float sommeNotes = 0;
        for (int i=0; i<notes.length; i++){
            sommeNotes += notes[i];
        }
        System.out.printf("Somme des notes = %.1f\n",sommeNotes);

        //Calcul de la moyenne
       float moyenne = sommeNotes/notes.length;
        System.out.printf("Moyenne des notes = %.1f\n",moyenne);
    }
}
