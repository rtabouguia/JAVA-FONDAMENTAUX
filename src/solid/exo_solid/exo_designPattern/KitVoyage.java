package solid.exo_solid.exo_designPattern;

import java.util.ArrayList;

public class KitVoyage implements printing {
    //est-il correct de laisser la listedesOptions dans la classe Kit dépendre de OptionVoyage? ou
    // doit-on faire une interface générique qui permet de définir un
    private ArrayList<OptionVoyage> listOptionsVoyage = new ArrayList<>();
    private String depart;
    private String destination;

    public KitVoyage(String depart, String destination) {
        this.depart = depart;
        this.destination = destination;
    }
    //est-ce que le setting et le getting doivent être dans le modèle?
    //sachant qu'ils servent à la gestion de l'objet, et non à décrire le comportement intrinseque de l'objet
    public ArrayList getListOptionsVoyage(){
        return listOptionsVoyage;
    }

    public double prix(){
        double prix=0.0;
        for (OptionVoyage ov: listOptionsVoyage){
            prix =prix + ov.prix();
        }
        return prix;
    }

    public String toString() {
        String text= String.format("Voyage de %s a %s avec pour options :\n", depart, destination);
        String optionVoyage ="";
        for (OptionVoyage ov: listOptionsVoyage){
            optionVoyage =optionVoyage+ String.format("Nom de l'option :%s\nPrix :%.1fEuros\n\n",ov.getNom(),ov.prix());
        }
        return text+optionVoyage;
    }
}
