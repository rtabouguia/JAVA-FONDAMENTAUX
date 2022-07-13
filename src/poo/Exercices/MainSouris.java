package poo.Exercices;

public class MainSouris {
    public static void main(String[] args) {
        Souris sourisS0 =new Souris();
        System.out.println(sourisS0.toString());

        Souris sourisS1 = new Souris();
        System.out.println(sourisS1.toString());

          //clonage 1
        Souris sourisCLonee = new Souris(sourisS1);
        System.out.println(sourisCLonee.toString());

        Souris sourisBlanche = new Souris(50, "blanche", 2, false);   //souris blanche creee
        System.out.println(sourisBlanche);

        Souris sourisGrise =new Souris(45, "grise", 0, false);  //souris grise creee
        System.out.println(sourisGrise);

        Souris sourisGriseClonee = new Souris(sourisGrise);     //souris grise clonee
        System.out.println(sourisGriseClonee);

        sourisBlanche.evolue();                 //souris blanche evolue de 2 à 36 mois
        System.out.println(sourisBlanche);

        sourisGrise.evolue();                   //souris grise evolue de 0 à 36 mois
        System.out.println(sourisGrise);
        sourisGriseClonee.evolue();               //souris grise clonee evolue

        System.out.println(sourisGriseClonee);

    }
}
