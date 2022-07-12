package fondamentaux;

import java.util.Scanner;


//E1. Calcul de la surface d'un cercle
public class CalculSurface {

    public static void main(String[] args) {

        //On demande à l'utilisateur de rentrer la valeur d'un diamètre de cercle
        System.out.print("Entrez une valeur de diamètre: ");
        Scanner data = new Scanner(System.in);
        double diametre = data.nextFloat();

        //On calcule la surface du cercle
        double surface = Math.pow((diametre/2), 2)*Math.PI;

        System.out.printf("la surface du cercle est :%f", surface);
    }

}
