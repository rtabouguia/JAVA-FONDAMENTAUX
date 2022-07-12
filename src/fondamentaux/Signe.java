package fondamentaux;

import java.util.Scanner;


//Les opérateurs ternaires
public class Signe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("entrer un nombre : ");
        int nombre = input.nextInt();
        String parite = nombre%2 ==0? "paire":"impair";
        //boolean estPair = nombre % 2 == 0;

        if (nombre > 0) {
            System.out.printf("%d est positif et %s", nombre, parite);
        } else if (nombre < 0) {
            System.out.printf("%d est negatif et %s", nombre, parite);
        } else {
            System.out.println("0 et pair");
        }
    }
}