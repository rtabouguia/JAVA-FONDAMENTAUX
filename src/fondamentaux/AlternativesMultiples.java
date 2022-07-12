package fondamentaux;

import java.util.Scanner;

public class AlternativesMultiples {
    public static void main(String[] args) {
    //    Demander d'entrer le nom d'un pays
    //SI no du pays="France", alors affiche "Bonjour"
    // Si nom est "Espagne" alors on affiche "hola"
    //Sinon si nom est "Allemagne" alors on affiche "Guten tag"
    //Sinon si nom est "Angleterre" afficher "Hello"
    //Sinon "Pys reconnué"

    Scanner input = new Scanner(System.in);
    System.out.print("Veuillez entrer un pays : ");
    String pays = input.nextLine();

    //method 1

    if (pays.equals("France")){
        System.out.println("Bonjour");
    }
    else if (pays.equals("Espagne")){
        System.out.println("Hola");
    }
    else if (pays.equals("Allemagne")){
        System.out.println("Guten Tag");
    }
    else if (pays.equals("Angleterre")){
        System.out.println("Hello");
    }else {
        System.out.println("Pays non reconnu");
    }



    }
}
