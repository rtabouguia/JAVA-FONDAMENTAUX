package fondamentaux;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Tp22DoubleChar {
//Ce programme check si dans le texte entré, on a 2 caractères qui se suivent
    public static boolean maMethod(@NotNull String text){
        boolean response = false;
        for(int i =0; i<text.length()-1; i++){
            String a= text.substring(i,i+1);
            String b= text.substring(i+1,i+2);
            response = a.equals(b)?true:false;
            if (response==true){
                break;
            }
        }
        return response;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez un texte :");
        String texte = input.nextLine();
        System.out.println(maMethod(texte));
        }


}
