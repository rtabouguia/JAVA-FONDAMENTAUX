package poo.heritage;

public class MainPersonnage {
    public static void main(String[] args) {
        var chris=new Guerrier("Christian",200,"M16 A4");
        var bamos=new Magicien("Bamos",500,"Baguette Zozor");
        var mamadou=new Sorcier("Mamadou",300,"BaguetteDou", "BatonZor");

        chris.rencontrer();
        bamos.rencontrer();
        mamadou.rencontrer();

        System.out.println(chris);
        System.out.println("\n");
        System.out.println(bamos);
        System.out.println("\n");
        System.out.println(mamadou);

    }

}
