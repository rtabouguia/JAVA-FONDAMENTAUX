public class BoucleFor {
    public static void main(String[] args) {

        //Pour compteur allant de 1 à 10, afficher le carre du nombre
        //compteur = compteur + 1
        //Fin pour

        for(int compteur=1; compteur<=10; compteur = compteur+1){
            System.out.printf("Le carré de %d est %.1f\n", compteur,Math.pow(compteur,2));
        }
    }
}
