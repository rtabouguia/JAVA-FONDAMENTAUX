import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Veuillez entrer un pays : ");
        String pays = input.nextLine();

        switch (pays){
            case "France":
                System.out.println("Bonjour");
                break;
            case "Espagne":
                System.out.println("Hola");
                break;
            case "Allemagne":
            System.out.println("Guten Tag");
            break;
            case "Angleterre":
            System.out.println("Hello");
            break;
            default:
            System.out.println("Pays non reconnu");
        }
    }
}
