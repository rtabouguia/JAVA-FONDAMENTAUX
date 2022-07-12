package poo;

public class Main {
    public static void main(String[] args) {

        //Objet=instance
        // Objet => Instance
        Avion boeing737Max=new Avion();
        boeing737Max.fabricant="Boeing";
        boeing737Max.modele="737 Max 10";
        boeing737Max.nombreSieges=200;
        boeing737Max.couleur="white";
        System.out.printf("Marque : %s\nModèle : %s\nNombre sieges : %d\nCouleur : %s\n",
                boeing737Max.fabricant,
                boeing737Max.modele,boeing737Max.nombreSieges,boeing737Max.couleur);

        System.out.println("\n");

        Avion airbusA320=new Avion();
        airbusA320.fabricant="Airbus";
        airbusA320.modele="A320";
        airbusA320.nombreSieges=150;
        airbusA320.couleur="white";
        System.out.printf("Marque : %s\nModèle : %s\nNombre sieges : %d\nCouleur : %s\n",
                airbusA320.fabricant,
                airbusA320.modele,airbusA320.nombreSieges,airbusA320.couleur);
    }
}
