package fondamentaux;

import org.jetbrains.annotations.NotNull;

public class TP23MatriceCarre {
// Ce programme calcule la somme des valeur de la diagonale d'une matrice carrée
    public static int sumMatriceDiag(int[] @NotNull [] matrice){
        int sum = 0;

        for (int i=0; i< matrice.length; i++){
            if(matrice.length !=matrice[i].length){
                System.out.println("La matrice n'est pas carrée");
                break;
            }
            for(int j=0; j<matrice[i].length;j++){
                sum= i==j?sum+matrice[i][j]:sum;
                //System.out.printf("%d, %d --",i,j);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int [][] tab = {{1,3,6,23}, {3,4,6,1}, {3,5,6,1}};
        int sum=sumMatriceDiag(tab);
        System.out.printf("some diagonale: %d",sum);
    }
}
