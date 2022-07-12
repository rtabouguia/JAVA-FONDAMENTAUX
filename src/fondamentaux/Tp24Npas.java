package fondamentaux;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Tp24Npas {


//Cette méthode prend en argument un nombre positif et entier, et renvoie à la console le nombre de #

    public static String sombrePas(int n) throws Exception{
        //System.out.println(n*0);
        //if(n*0 !=0) throw new Exception("Valeur incorrecte, entrez un nombre positif et entier");
        String strNbr = "";
        if(n==0){
            strNbr= "";
        }
         else{
             for(int i=1; i<=n; i++){
                 if (i<n){
                     String strNbrintermediaire = "#".repeat(i);
                     strNbr = strNbr+"'"+strNbrintermediaire+" '\n";
                     //System.out.println("strNbr= "+strNbr);
                 }
                 else if(i==n){
                     strNbr =strNbr+"'"+"#".repeat(i)+"'";
                 }
            }

        }
        return strNbr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
       try{
           int nombre = input.nextInt();
           System.out.println(sombrePas(nombre));
       }
       catch (Exception err){
           System.out.println("Vous avez entré une valeur incorrecte");
       }
    }
}
