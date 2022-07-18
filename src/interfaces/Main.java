package interfaces;

public class Main {

    public static void main(String[] args) {
        var superman = new SuperHerosVolant("Clark Kent", "23/09/1889", 500, 1000);
        var flash = new SuperHerosCourant("Barry Allen", "03/05/1890", 300, 200);
        var insecte = new MechantInsecte("Jeff Goldblum", "05/02/1790");

        var action = new Actions();
        //la classe SuperHerosVolant implemente l'interface Voler;
        //la classe action définit une méthode qui recoit en paramètre l'interface Voler;
        action.presenterUnInsectVolant(superman);
    }
}
