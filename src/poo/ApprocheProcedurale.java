package poo;

public class ApprocheProcedurale {

    static double calculPerimetre(double longueur, double largeur){
        return 2*(longueur+largeur);
    }

    static double calculSurface(double longueur, double largeur){
        return largeur*longueur;
    }
    public static void main(String[] args) {
        double longueur = 200.5;
        double largeur =80.3;


        calculPerimetre(longueur,largeur);
        calculSurface(longueur,largeur);
    }
}
