package poo.heritage.Exercices;

public class Personne {
    private String nom ;
    private String nomSection;
    private int anneeArrivee;
    private String poste;

    public Personne(String nom, String nomSection, int anneeArrivee, String poste) {
        this.nom = nom;
        this.nomSection = nomSection;
        this.anneeArrivee = anneeArrivee;
        this.poste = poste;
    }

    public String getNom() {
        return nom;    }

    public String getNomSection() {
        return nomSection;    }

    public int getAnneeArrivee() {
        return anneeArrivee;    }

    public String getPoste() {
        return poste;    }


    //cette methode retourne vrai si la personne est un étudiant
    public boolean estEtudiant(Personne lambda){
         return lambda.poste.equals("Etudiant");
    }
}
