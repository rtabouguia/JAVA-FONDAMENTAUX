package poo;

public enum Personnes {
    ENSEIGNANT,
    ETUDIANT_REGULIER,
    ETUDIANT_ECHANGE,
}

class MainEnum{
    public static void main(String[] args) {
        Personnes etudiant =Personnes.ETUDIANT_ECHANGE;
    }
}
