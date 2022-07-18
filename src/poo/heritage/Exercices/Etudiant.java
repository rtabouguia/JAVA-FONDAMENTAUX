package poo.heritage.Exercices;

public class Etudiant extends Personnel{
    private String type;
    private float moyenne;
    private final float NOTE_PAR_DEFAUT =0;
    private String nomUniversite;
    private final String NOM_UNIVERSITE="CLBIT";


    //etudiant regulier
    public Etudiant(String nom, String nomSection, int anneeArrivee, String poste, float moyenne) {
        super(nom, nomSection, anneeArrivee, poste);
        this.moyenne = moyenne;
        this.nomUniversite = NOM_UNIVERSITE;
        this.type ="Regulier";
    }

    //etudiants en echange
    public Etudiant(String nom, String nomSection, int anneeArrivee, String poste, float moyenne, String nomUniversite){
        this(nom, nomSection, anneeArrivee, poste, moyenne);
        this.type = "Echange";
        this.moyenne =NOTE_PAR_DEFAUT;
        this.nomUniversite =nomUniversite;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public float getMoyenne() {
        return moyenne;
    }
    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }
    public String getNomUniversite() {
        return nomUniversite;
    }
    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }
}
