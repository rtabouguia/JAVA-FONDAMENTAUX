package poo;

public class Main {
    public static void main(String[] args) {
            // Objet => Instance
            Avion boeing737Max=new Avion("Boeing","737 Max 10",200,"white");
            System.out.printf("%s\n====================\n",boeing737Max.nomCompletAvion());
            System.out.printf("Marque : %s\nModèle : %s\nNombre sieges : %d\nCouleur : %s\n",
                    boeing737Max.getFabricant(),
                    boeing737Max.getModele(),boeing737Max.getNombreSieges(),boeing737Max.getCouleur());

            System.out.println("\n");

            Avion airbusA320=new Avion("Airbus","A320",150,"white");
            System.out.printf("%s\n====================\n",airbusA320.nomCompletAvion());
            System.out.printf("Marque : %s\nModèle : %s\nNombre sieges : %d\nCouleur : %s\n",
                    airbusA320.getFabricant(),
                    airbusA320.getModele(),airbusA320.getNombreSieges(),airbusA320.getCouleur());

    }
}
