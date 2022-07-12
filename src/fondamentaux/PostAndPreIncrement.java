package fondamentaux;

public class PostAndPreIncrement {

    public static void main(String[] args) {
        int a =2;

        //Post incrementation
        //1: On affecte à b l'ancienne valeur de a(2)
        //2: Comme l'increment est faite à droite, la valeur de a va s'incrémenter de 1
        //3: Donc a vaudra 3, et b vaudra 2

        int b=a++;
        System.out.println(a); //3
        System.out.println(b); //2


        //Pre incrementation
        //1: Comme l'increment est faite à gauche, la valeur de x va d'abord incrémenter 1
        //2: On affecte à y la nouvelle valeur de x(4) après son incrémentation
        //3: Donc a vaudra 4, et b vaudra 4

        int x=3;
        int y=++x;
        System.out.println(x); //3
        System.out.println(y); //2
    }
}
