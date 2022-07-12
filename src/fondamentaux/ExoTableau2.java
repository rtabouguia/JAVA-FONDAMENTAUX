package fondamentaux;

import java.util.Scanner;

public class ExoTableau2 {
    public static void main(String[] args) {

        int[] tab1 = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.printf("Saisir des nombres pour remplir le tableau\n");

        //filling the tab
        for (int index = 0; index < tab1.length; index++) {
            tab1[index] = input.nextInt();
            System.out.println(tab1[index]);
        }
        //Afficher un nombre et rechercher dans le tableau
        System.out.printf("Donner un nombre à rechercher: ");
        int nombre = input.nextInt();

        //tester si le nombre existe ou pas
        int compteur =0;
        for(int index =0; index < tab1.length; index++){
            compteur = tab1[index]==nombre? compteur+1:compteur+0;
          }
        if(compteur !=0){
            System.out.printf("Le nombre existe, %d fois",compteur );
        }else{
            System.out.printf("Le nombre n'existe pas");
        }
    }
}
