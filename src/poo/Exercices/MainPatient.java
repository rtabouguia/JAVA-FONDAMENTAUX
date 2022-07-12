package poo.Exercices;

public class MainPatient {
    public static void main(String[] args) {
        Patient zero = new Patient(80,1.71f);
        zero.setName("Raisa");

        //Afficher les données du patient
        System.out.println(zero.imc(zero.getPoids(), zero.getTaille()));
        System.out.println(zero.toString());
        System.out.println("Taille du patient: "+zero.getTaille());
        System.out.println("Poids du patient: "+zero.getPoids());
    }
}
