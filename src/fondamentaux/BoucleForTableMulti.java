package fondamentaux;

import java.util.Scanner;

public class BoucleForTableMulti {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int nombre = input.nextInt();

        System.out.printf("Depart : ");
        int depart = input.nextInt();

        System.out.println("Arrêt : ");
        int arret = input.nextInt();

        System.out.printf("fondamentaux.Table de multiplication de %d\n =====================", nombre);

        for(int compteur=depart; compteur<=arret; compteur++){
            int produit=nombre*compteur;
            System.out.printf("%d  x  %d  = %d\n", nombre, compteur, produit);
        }
    }
}
