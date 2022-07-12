package fondamentaux;

import java.util.Scanner;

public class EquationSndDeg {

    //Resolution d'un equation de Second degre de la forme ax² + bx + c
    //l'utilisateur entre 3 nombres a, b, c avec a different de 0

    public static void main(String[] args) {


        System.out.println("Entrez un nombre réel a !=0 : ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();

        System.out.println("Entrez un nombre réel b : ");
        // Scanner input2 = new Scanner(System.in);
        double b = input.nextDouble();

        System.out.println("Entrez un nombre réel c : ");
        //Scanner input3 = new Scanner(System.in);
        double c = input.nextDouble();

        double delta = Math.pow(b,2) - (4*a*c);
        System.out.println("delta="+ delta);
        if (a==0){
            System.out.println("Votre nombre a=0");
        }
        else if(delta < 0){
            System.out.printf("L'equation %dx² + %dx + %d n'a pas de solution réelle\n", a,b,c);
        }
        else if (delta == 0) {
            double x0 = -b/2*a;
            System.out.printf("L'equation %dx² + %dx + %d a une unique solution x0=%d\n", a,b,c, x0);
        }
        else if (delta > 0) {

                double x1 = (-b-Math.sqrt(delta))/(2*a);
                double x2 = (-b+Math.sqrt(delta))/(2*a);
                System.out.printf("L'equation %dx2 + %dx + %d a deux solutions x1=%.1f et x2=%.1f\n", a,b,c, x1, x2);

        }


    }
}

