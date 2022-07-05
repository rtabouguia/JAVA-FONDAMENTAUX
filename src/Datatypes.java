public class Datatypes {
    public static void main(String[] args) {
//        Chaine de caractères
        String prenom="Christian";
        String nom="Lisangola";
        String nomComplet=prenom+" "+nom;

//        Caractère
        char genre='m';

//        Réels
//        Poids : 85.32746832643467322
//        Prix : 45.78698976869
        float poids=85.5F;
        float tjm=8.4F;

//        Réel double précision
        double v=45.3;

//        Byte : une variante d'entier court
        byte age=89;

        System.out.println("Je suis "+prenom+" "+nom+",j'ai "+age+" ans.Mon Tjm est de "+tjm+
                " €.");

        System.out.printf("Je suis %s %s,j'ai %d ans.Mon TJM est de %.1f€.\n",prenom,nom
                ,age
                ,tjm);
    }
}
