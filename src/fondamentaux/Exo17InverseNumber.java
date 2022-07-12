package fondamentaux;

import java.util.Scanner;

public class Exo17InverseNumber {

    public static void main(String[] args) {
    //Ce programme recoit de l'utilisateur un nombre et l'inverse
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez un nombre");

        int nombre = input.nextInt();

        String stringNombre = String.valueOf(Math.abs(nombre));
        String stringInverseNombre = "";
        for (String lettre: stringNombre.split("")){                                       //methode1
            stringInverseNombre = lettre + stringInverseNombre;
        }

    //    for (int i= stringNombre.length()-1; i>=0; i--){                                       methode1
    //        stringInverseNombre = stringInverseNombre+stringNombre.charAt(i);                  methode1
    //    }
        int nombreInverse = Integer.valueOf(stringInverseNombre);                                //methode2
        int nombreInverse2 = (int)Math.signum(nombre)*nombreInverse;                             //methode2
    //nombreInverse = nombre>0?nombreInverse:(-1)*nombreInverse;                                 methode1
        System.out.println("Résultat: "+nombreInverse2);

    }
}
