package fondamentaux;

public class Table {
    public static void main(String[] args) {
        //Tables de multiplication de 2 à 10
        for(int y=2; y<=10; y++ ){
            System.out.printf("La table de multiplication de %d :\n",y);
            for(int x=1; x<=10; x++){
                int produit =x*y;
                System.out.printf("%d x %d = %d\n",x, y, produit);
            }
        }
    }
}
