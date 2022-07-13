package poo.heritage;

public class Sorcier extends Magicien {

    String batonMagique;
    public Sorcier(String nom, int dureeDeVie, String baguette, String batonMagique) {
        super(nom, dureeDeVie, baguette);
        this.batonMagique = batonMagique;
    }

    @Override
    public void rencontrer(){
        System.out.println("Je vais te transformer en biscuit !");
    }

    @Override
    public String toString(){
        return super.toString()+String.format("\nBaton magique :%s", batonMagique);
    }

}
