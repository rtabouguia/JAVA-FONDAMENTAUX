package solid.exo_solid.exo_designPattern;

public class OptionVoyageTransport extends OptionVoyage{
    public double prixForfait;
    public boolean trajetLong;
    public final double TARIF_BASE = 200.0;   //prix du transport pour transport court
    public final double TARIF_LONG = 1500.0;  //prix du transport pour transport long

    public OptionVoyageTransport(String nom, double prixForfait, boolean trajetLong) {
        super(nom, prixForfait);
        this.trajetLong = trajetLong;
    }
    @Override
    public double prix(){
        prixForfait= trajetLong?super.prix()+TARIF_LONG:super.prix()+TARIF_BASE;
        return prixForfait;
    }


}
