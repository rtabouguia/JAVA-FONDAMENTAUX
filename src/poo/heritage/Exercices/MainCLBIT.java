package poo.heritage.Exercices;

public class MainCLBIT {
    public static void main(String[] args) {
        //On ajoute des personnes dans la liste
        Salarié sarah = new Salarié("Sarah", "Administration", 2010,
                "Secretaire", 2000);
        Salarié chris = new Salarié("Christian", "Informatique", 2012,
                "Enseignant", 2500);

        //Etudiants  reguliers
        Etudiant E1 = new Etudiant("Thomas", "Scolarite",
                2013, "Etudiant",  14);
        Etudiant E2 = new Etudiant("Maxime", "Scolarite", 2014,
                "Etudiant", 16);
        Etudiant E3 = new Etudiant("Standford", "Scolarite", 2015,
                "Etudiant", 0, "Institut des Sciences du Vivant de Paris 14");
        Etudiant E4 = new Etudiant("Anna", "Scolarite", 2016,
                "Etudiant", 0, "Universite de Hong-Kong");


        Direction D1 =new Direction();
        D1.addPersonne(E1);
        D1.addPersonne(E2);
        D1.addPersonne(E3);
        D1.addPersonne(E4);
        D1.addPersonne(chris);
        D1.addPersonne(sarah);

        //Affiche l'etat du personnel du CLBIT
         System.out.println(D1.toString());

    }
}
