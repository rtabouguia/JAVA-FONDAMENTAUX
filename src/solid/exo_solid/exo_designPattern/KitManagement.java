package solid.exo_solid.exo_designPattern;
//
public class KitManagement {
    public void ajouterOption(OptionVoyage ov, KitVoyage kv){

        if(ov!=null){kv.getListOptionsVoyage().add(ov);};
    }

    public void annuler(KitVoyage kv){
        kv.getListOptionsVoyage().clear();
    }

    public int getNbOptions(KitVoyage kv){
        return kv.getListOptionsVoyage().size();
    }

    public void printingOptions(printing printing){
        System.out.println(printing);
    }
}
