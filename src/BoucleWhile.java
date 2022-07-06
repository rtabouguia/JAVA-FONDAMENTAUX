import java.util.Scanner;

public class BoucleWhile {

    public static void main(String[] args) {
                //Definition du code PIN
        // Fixer le nombre de caractères à 4
        // Demander à l'utilisateur de reessayer tant que le code PIN ne contient pas
        //        exactement 4 chiffres
        //   Limiter le nombre de tentatives à 3.Mais ne pas utiliser une boucle for
        //   Si au bout 3 tentatives, le code PIN n'est toujours pas correct, alors on
        //   affiche "Votre appareil est bloqué, et on sort de la boucle"

        Scanner input=new Scanner(System.in);
//        Fixer le nombre de caractères à 4
//        Demander à l'utilisateur de reessayer tant que le code PIN ne contient pas
//        exactement 4 chiffres

//        Définition du code PIN
        System.out.print("Veuillez définir un code PIN : ");
        int codePIN=input.nextInt();

//        Essayer de deverouiller le téléphone avec un code PIN
        int codePINATester;

//        Limiter le nombre de tentatives à 3.Mais ne pas utiliser une boucle for
//        Si au bout 3 tentatives, le code PIN n'est toujours pas correct, alors on
//        affiche "Votre appareil est bloqué, et on sort de la boucle"
        while (true){
            System.out.print("Entrer un code PIN pour déverouiller l'appareil " +
                    ": ");
            codePINATester=input.nextInt();//1234
            if(codePINATester==codePIN){
                System.out.println("**************************");
                System.out.println("** Appareil déverouillé **");
                System.out.println("**************************");
                break;
            }
            System.out.println("Code PIN Erroné.Veuillez reessayer");
        }


    }
}
