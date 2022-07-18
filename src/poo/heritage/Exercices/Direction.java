package poo.heritage.Exercices;

import java.util.ArrayList;

public class Direction {
    ArrayList<Personne> listePersonnesCLBIT = new ArrayList<>();

    public void addPersonne(Personne abc){
        listePersonnesCLBIT.add(abc);
      }
      public int nbreTotalPersonneCLBIT(){
        return listePersonnesCLBIT.size();
    }
    public int nbreTotalEtudiant(){
        int totalEtudiant=0;
        for ( Personne entry: listePersonnesCLBIT){
            totalEtudiant= entry.getPoste().equals("Etudiant") ?totalEtudiant+1:totalEtudiant;
                   }
        return totalEtudiant;
    }

    public String infosGenerales(){
       return String.format("Le personnel de CLBIT comprend %d personnes dont %d etudiants",
                nbreTotalPersonneCLBIT(), nbreTotalEtudiant());
    }

    @Override
    public String toString(){
        String infos ="";

        for ( Personne entry: listePersonnesCLBIT){
            infos = String.format("nom :%s,\n section: %s,\n annee: %d\n",
                    entry.getNom(), entry.getNomSection(), entry.getAnneeArrivee());
            if (entry.getPoste().equals("Etudiant")) {
                Etudiant etud=(Etudiant)entry;
                System.out.println(infos+String.format("Etudiant inscrit en mode %s,\n moyenne :%.1f\n ",
                        etud.getType(), etud.getMoyenne()));
            }
            else if (entry.getPoste().equals("Secretaire")) {
                Salarié secret =(Salarié) entry;
                System.out.println("Secretaire\n"+infos+String.format("Salaire: %.1f\n", secret.getSalaire()));
            }
            else if (entry.getPoste().equals("Enseignant")) {
                Salarié enseigne =(Salarié) entry;
                System.out.println(infos+String.format("Salaire: %.1f\n Laboratoire: %s\n",
                        enseigne.getSalaire(), enseigne.getNomSection()));
            }
        }return infos="";

    }
}



