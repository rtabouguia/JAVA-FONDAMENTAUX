package fondamentaux;

import java.util.Scanner;

public class ExoTableau1 {
    public static void main(String[] args) {

        int[] tab1 = new int[5];
        int[] tab2 = new int[4];
        int[] tab3 = new int[8];
        int[] tabContent = new int[tab1.length+tab2.length+ tab3.length];
        int sommeTabs = 0;

        Scanner input = new Scanner(System.in);
//fil tab1
        System.out.printf("Saisir des nombres pour remplir le tableau tab1");
        for (int index = 0; index < tab1.length; index++) {
            tab1[index] = input.nextInt();
            tabContent[index] = input.nextInt();
        }
//fill tab2
        System.out.printf("Saisir des nombres pour remplir le tableau tab2");
        for (int index = 0; index < tab2.length; index++) {
            tab2[index] = input.nextInt();
            tabContent[index+ tab1.length] = input.nextInt();
        }
//fill tab3
        System.out.printf("Saisir des nombres pour remplir le tableau tab3");
        for (int index = 0; index < tab1.length; index++) {
            tab1[index] = input.nextInt();
            tabContent[index+ tab1.length+tab2.length] = input.nextInt();
        }

        //La somme des int des 3 tableaux multiples de 3
        for (int contentTab1 : tab1) {
            //enregistre toutes les valeurs de tab1 dans tabContent
            sommeTabs = contentTab1 % 3 == 0?sommeTabs+contentTab1:0;
            }
        for (int contentTab2 : tab2) {

            sommeTabs = contentTab2 % 3 == 0? sommeTabs+contentTab2:0;
                }
        for (int contentTab3 : tab3) {
            sommeTabs = contentTab3 % 3 == 0?sommeTabs +contentTab3:0;
        }
        //print tabs sum
        System.out.printf("S = %d\n", sommeTabs);
        //Print tab content
        String printed = " ";
        for (int content: tabContent){
            printed = printed+", "+content;
        }
        System.out.printf("[ %s ]", printed);


    }
}