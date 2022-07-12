package fondamentaux;

import java.util.Arrays;

public class TP21tableau2D {
//Ce programme cherche un nombre fourni en entrée dans un matrice
//et renvoie le nombre de fois que le nombre est présent et les différentes positions
    public static String maMethode(int[][]tableau2D, int num){
        String response ="";
        String positions = "";
        int compteur =0;
        for(int i=0; i< tableau2D.length; i++){
            for(int j=0; j< tableau2D[i].length; j++){
                if (num == tableau2D[i][j]){
                    compteur =compteur+1;
                    positions = positions + " ("+i+","+j+") ";
                }
            }
        }
        response = num + " se retrouve dans les emplacements suivants :"+positions;
        return response;
    }

    public static void main(String[] args) {
        int [][] tab = {{1,3,6,23}, {3,4,6,1}};
        int nber =1;
        System.out.println(maMethode(tab, nber)); ;
    }
}
