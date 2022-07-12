package fondamentaux;

public class Permutation {
    public static void main(String[] args) {
        int a=40, b=456, c=857;
        System.out.printf("Les valeurs entrees sont a=%d, b=%d, c=%d\n", a, b, c);
        int temp=b;
        b=a;
        a=c;
        c=temp;

        System.out.printf("Les valeurs permutees sont a=%d, b=%d, c=%d", a, b, c);
    }

}
