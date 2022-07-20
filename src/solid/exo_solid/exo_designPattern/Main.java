package solid.exo_solid.exo_designPattern;

public class Main {
    public static void main(String[] args) {
        KitManagement km =new KitManagement();
        OptionVoyageSejour niceForNight= new OptionVoyageSejour("Nice for Night", 100.0, 1, 50);
        OptionVoyageTransport bestSNCF = new OptionVoyageTransport("Best SNCF", 100, false);

        KitVoyage classicforNice = new KitVoyage("Paris", "Nice" );
        km.ajouterOption(niceForNight, classicforNice);
        km.ajouterOption(bestSNCF, classicforNice);

        km.printingOptions(classicforNice);
        System.out.println("\n");
        km.printingOptions(niceForNight);
    }
}
