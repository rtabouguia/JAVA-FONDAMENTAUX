package poo.Exercices;

public class Patient {

    private String name;
    private float taille;
    private float poids;

    public Patient(float poids, float taille) {
        this.taille = taille;
        this.poids = poids;
    }

    public String getName() {
        return name;
    }
    public float getTaille() {
        return taille;
    }
    public float getPoids() {
        return poids;
    }
//modificateurs
    public void setTaille(float taille) {
        this.taille = taille;
    }
    public void setPoids(float poids) {
        this.poids = poids;
    }
    public void setName(String name) {
        this.name = name;
    }

//Calcul de l'IMC: Indice de Masse Corporelle
    public double imc(float poids, float taille){
        return  (poids/Math.pow(taille,2));
    }

//Afficher les donnees du patient
    public String toString(){
        return String.format("Le patient %s pese %.0fkg et mesure %.2fm. Son IMC est de %.1f\n",
                name, poids, taille, imc(poids, taille));
    }

}
