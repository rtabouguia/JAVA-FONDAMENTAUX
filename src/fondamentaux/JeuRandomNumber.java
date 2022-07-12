package fondamentaux;

import java.util.Random;
import java.util.Scanner;

//Ce programme fait deviner un nombre généré au hasard
public class JeuRandomNumber {

    public static void main(String[] args) {

        Random obj = new Random();
        int numAleatoire = obj.nextInt(100);
        System.out.println(numAleatoire);

        Scanner input = new Scanner(System.in);
        System.out.println("Saisissez un nombre pour deviner le nombre aleatoire :");

        while(true){
            int nombre = input.nextInt();
            if(nombre > numAleatoire){
                System.out.println("Entrez un nombre plus petit : ");
            }
            else if (nombre < numAleatoire) {
                System.out.println("Entrez un nombre plus grand : ");
            }
            else {
                System.out.println("Vous avez gagné !");
                break;
            }
        }

    }
}
