package fondamentaux;

import java.util.Scanner;

public class TableauInitialization {
    public static void main(String[] args) {
        float [] notes = new float[5]; // {0.0, 0.0, 0.0, 0.0, 0.0}
        for(float note: notes){
            System.out.println(note);
        }

        //        Saisir les notes à partir du clavier
        Scanner input=new Scanner(System.in);
        for(int index=0;index<notes.length;index++){
            System.out.printf("Saisir la note %d : ",index+1);
            notes[index]=input.nextFloat();

        }


//        Afficher les notes saisies
        for(float note:notes){
            System.out.println(note);
        }

    }
}
