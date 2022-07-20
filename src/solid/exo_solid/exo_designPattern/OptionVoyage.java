package solid.exo_solid.exo_designPattern;

public abstract class OptionVoyage implements printing{
    private String nom;
    private double prix;

    public OptionVoyage(String nom, double prix){
        this.nom=nom;
        this.prix = prix;
    }

    public String getNom(){
        return nom;
    }

    public double prix(){
        return prix;
    }
    public String toString(){
        return String.format("Nom de l'option :%s\nPrix :%.1fEuros\n\n",nom,prix());
    };
}
