package poo.heritage;

public abstract class Personnage {
    private String nom;
    private int dureeDeVie;

    public Personnage(String nom, int dureeDeVie){
        this.nom=nom;
        this.dureeDeVie=dureeDeVie;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
    }


    public abstract void rencontrer();
    @Override
    public String toString() {
        return String.format("Nom : %s\nDuree de vie : %d\n",nom,dureeDeVie);
    }

}

