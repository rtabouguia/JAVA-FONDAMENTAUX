package poo.Exercices;

public class Personne {
    private String name;
    private String firstname;
    private int nbreEnfants;
    private String situationMatrimoniale;


    public String nomComplet (String name, String firstname){
        return firstname+" "+name;
    }

    public String getName(){
        return name;
    }
    public String getFirstname(){
        return firstname;
    }
    public int getNbreEnfants(){
        return nbreEnfants;
    }
    public String getSituationMatrimoniale(){
        return situationMatrimoniale;
    }
    //modificateurs
    public void setName(String name){
        this.name=name;
    }
    public void setFirstname(String firstname){
        this.firstname =firstname;
    }
    public void setNbreEnfants(int nbreEnfants){
        this.nbreEnfants=nbreEnfants;
    }
    public void setSituationMatrimoniale(String situationMatrimoniale){
        this.situationMatrimoniale =situationMatrimoniale;
    }
}
