package faculdade;

public class Fibonacci {
    public static void main(String[] args) {
        int n1,n2,i,soma; 
        n1 = 0 ;
        n2 = 1 ;
        System.out.print(n1+", "+n2+", ");
        soma = n1+n2 ; 
        i = 1 ;
        while (i <= 5000) {
            n1 = n2;
            n2 = soma;
            soma = n1+n2;
            System.out.print(soma+", ");
            i++;
        }
    }
}
