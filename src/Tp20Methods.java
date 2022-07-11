import java.util.Scanner;

public class TpMethods {

    public static boolean isPrefix(String txt1, String txt2) {

        boolean response =false;
        System.out.println(txt1.substring(0));
        if (txt2.length()<txt1.length()) {
            for (int i = 1; i <= txt2.length(); i++) {

                String txt1Substring = txt1.substring(0, i);
                String txt2Substring = txt2.substring(0, i);
                System.out.println(txt1.substring(0, i));
                response = txt1Substring.equals(txt2Substring) ? true : false;

                if (response == false && i < 2) {
                    break;
                }
                else {
                    response = true;
                    }

                }

        }
        return response;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String t1 ="";
        String t2 = "";
        try {
            System.out.println("Entrez un texte: ");
            t1 = input.nextLine();
            System.out.println("Entrez un autre texte: ");
            t2 = input.nextLine();
        }
        catch (Exception err){
            System.out.println("ENtrez un texte valide: ");
        }

        System.out.println(isPrefix(t1, t2));
    }
}
