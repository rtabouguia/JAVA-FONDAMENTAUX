package poo.Exercices;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle R1 =new Rectangle();
        R1.setLongueur(200);
        R1.setLargeur(150);
        //Calculons surface

        double surface = R1.aire(R1.getLongueur(), R1.getLargeur());
        double perimetre = R1.perimetre(R1.getLongueur(), R1.getLargeur());

        System.out.println("surface= "+surface);
        System.out.println("perimetre= "+perimetre);
    }

}
