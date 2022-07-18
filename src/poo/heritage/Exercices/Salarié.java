package poo.heritage.Exercices;

public class Salarié extends Personne {
    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    private float salaire;

    public Salarié(String nom, String nomSection, int anneeArrivee, String poste, float salaire) {
        super(nom, nomSection, anneeArrivee, poste);
        this.salaire = salaire;
    }
}
