import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckNumber {

    //Le programme demande un nombre à l'utilisateur et retourne si le numero est
    //positif, négatif, egal à zéro ou s'il est pair ou impair
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = input.nextInt();

        if (nombre == 0){
            System.out.println("Le nombre est zéro et il est pair");
        }
        else if(nombre > 0 && nombre%2==0){
            System.out.println("Le nombre est positif et pair");
        }
        else if(nombre > 0 && nombre%2!=0){
            System.out.println("Le nombre est positif et impair");
        }
        else if(nombre < 0 && nombre%2==0){
            System.out.println("Le nombre est négatif et pair");
        }
        else if(nombre < 0 && nombre%2!=0){
            System.out.println("Le nombre est negatif et impair");
        }
    }
}
