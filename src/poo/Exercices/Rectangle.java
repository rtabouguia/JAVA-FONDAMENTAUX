package poo.Exercices;

public class Rectangle {
    private  double longueur;
    private double largeur;


    public double aire(double longueur, double largeur){
        return longueur*largeur;
    }

    public double perimetre(double longueur, double largeur){
        return 2*(largeur+longueur);
    }
    //accesseurs
    public double getLongueur(){
        return longueur;
    }
    public double getLargeur(){
        return largeur;
    }

    //modificateurs
    public void setLongueur(double longueur){
        this.longueur=longueur;
    }
    public void setLargeur(double largeur){
        this.largeur=largeur;
    }

}
