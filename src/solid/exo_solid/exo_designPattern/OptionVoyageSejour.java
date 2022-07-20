package solid.exo_solid.exo_designPattern;

public class OptionVoyageSejour extends OptionVoyage {

    private int nbreNuit;
    private double prixNuit;

    public OptionVoyageSejour(String nom, double prixForfait, int nbreNuit, double prixNuit) {
        super(nom, prixForfait);
        this.nbreNuit = nbreNuit;
        this.prixNuit = prixNuit;
    }
    @Override
    public double prix(){
        return nbreNuit*prixNuit + super.prix();

    }


}
