package fondamentaux;

import java.util.Arrays;

public class FuntionArray {
    //{1,2,3,4,5}
    // {6,7,8,9,10}
    //{7,9,11,13,15}
    //Additionnons les valeurs des 2 tableaux à chaque index
    //On suppose que les 2permiers tableaux ont la même taille
    static int[] produceSumArray(int[] tableauNombres1, int[]tableauNombres2) throws Exception{
        if(tableauNombres1.length !=tableauNombres2.length){
            throw new Exception("Les 2 tableaux ont des tailles différentes");
        }
        int taille = tableauNombres1.length;
        int[] tableauResultant = new int[taille];
        for(int i=0; i<taille;i++){
            tableauResultant[i] = tableauNombres1[i]+tableauNombres2[i];
        }
        return tableauResultant;
    }
    public static void main(String[] args) {
        int[] tb1 ={1,2,3,4,5};
        int[] tb2={6,7,8,9};
        try{
            int [] tbsom = produceSumArray(tb1,tb2);
            System.out.println(Arrays.toString(tbsom));
        }catch (Exception err){
            System.out.println("Erreur ==> "+err);
        }


    }
}
