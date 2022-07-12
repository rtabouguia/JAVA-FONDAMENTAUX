package fondamentaux;

import java.util.Scanner;

public class FunctionsWithArays {
    static int sumArray(int[] numbersArray){
        int sum=0;
        for(int number:numbersArray){
            sum=sum+number;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers={2,3,4,5,6,7,8};
        System.out.println(sumArray(numbers));
//
        String a="jean";
        String b="jean";
        System.out.println("a==b : "+(a==b));

        String c=new Scanner(System.in).nextLine();
        c=c.intern();
        System.out.println("a==c : "+(a==c));


        String x=new Scanner(System.in).nextLine();
        String y="jean";
        System.out.println("x == y : "+(x==y));
    }
}
