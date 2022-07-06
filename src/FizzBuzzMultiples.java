import java.util.Scanner;

public class FizzBuzzMultiples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Saisissez un nombre :");
        int n = input.nextInt();


        for (int i=1; i<=n; i++){

            if (i%3 ==0){
               System.out.println("fizz");
            }
            else if (i%5 == 0){
                System.out.println("buzz");
            }
            else{
                System.out.println(i);
            }
        }

    }
}
