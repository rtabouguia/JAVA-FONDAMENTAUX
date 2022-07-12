package poo.Exercices;

import java.util.Scanner;

public class MainPersonne {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Personne individu = new Personne();
        System.out.println("Entrez votre nom :");
        String name = input.nextLine();
        individu.setName(name);
        System.out.println("Entrez votre prenom :");
        String firstname = input.nextLine();
        individu.setFirstname(firstname);
        System.out.println("Situation matrimoniale :");
        String situationMat = input.nextLine();
        individu.setSituationMatrimoniale(situationMat);
        System.out.println("Entrez le nombre de vos enfant(s) :");
        int nbreEnfants = input.nextInt();
        individu.setNbreEnfants(nbreEnfants);


        System.out.printf("%s %s\n%s\n %d enfants",individu.getFirstname(), individu.getName(),
                individu.getSituationMatrimoniale(),individu.getNbreEnfants());
    }
}

