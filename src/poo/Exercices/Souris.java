package poo.Exercices;

public class Souris {
    private int poids;
    private String couleur;
    private int age;
    private boolean clonee;
    private final int ESPERANCE_VIE_DEFAUT =36;
    private int esperanceVie;

//accesseurs
    public int getPoids() {
        return poids;
    }
    public String getCouleur() {
        return couleur;
    }
    public int getAge() {
        return age;
    }
    public boolean isClonee() {
        return clonee;
    }

    public int getEsperanceVie() {
        return esperanceVie;
    }

//modificateurs

    public void setPoids(int poids) {
        this.poids = poids;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setClonee(boolean clonee) {
        this.clonee = clonee;
    }
    public void setEsperanceVie(int esperanceVie) {
        this.esperanceVie = esperanceVie;
    }


    public Souris(int poids, String couleur, int age, boolean clonee){
        this.poids =poids;
        this.couleur=couleur;
        this.age=age;
        this.clonee=clonee;
        this.esperanceVie =ESPERANCE_VIE_DEFAUT;
    }
    public Souris(){
        this.age=0;
        this.esperanceVie =ESPERANCE_VIE_DEFAUT;
    }

    public Souris(Souris sourisOrigine){
        this.poids =sourisOrigine.poids;
        this.age =sourisOrigine.age;
        this.esperanceVie=(sourisOrigine.esperanceVie*4)/5;
        this.clonee =true;
        this.couleur=sourisOrigine.couleur;
    }

    public String toString(){
        if (clonee ==true) {
            if (poids == 0) {
                return String.format("Clonage d'une souris !\n");
            }
            else return String.format("Une souris %s, clonee de %d mois et pesant %d grammes\n", couleur, age, poids);
        }
        else if(poids == 0){
            return String.format("Une nouvelle souris !\n");
        }
        return String.format("Une souris %s, de %d mois et pesant %d grammes\n", couleur, age, poids);
    }

    public void vieillir(){
        this.age++;
        if(clonee ==true && this.age >(this.esperanceVie/2)){
            this.couleur="verte";
        }
    }

    public void evolue(){
        for(int i =this.age; i<this.esperanceVie; i++){
              this.vieillir();
        }
    }

}
