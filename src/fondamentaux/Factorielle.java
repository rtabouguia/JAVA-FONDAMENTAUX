package fondamentaux;

import java.util.Scanner;

public class Factorielle {
    public static void main(String[] args) {

        // Ce programme calcule la factorielle d'un nombre
        System.out.println("Entrez un nombre : ");
        Scanner input = new Scanner(System.in);
        int nombre = input.nextInt();
        int factorielle = 1;

        if(nombre == 0){
            factorielle = 1;
        }
        else{
            for (int i=nombre; i>=1; i--){
                factorielle = factorielle * i;
            }
        }

        System.out.printf("fondamentaux.Factorielle de %d : %d", nombre, factorielle);
    }
}
