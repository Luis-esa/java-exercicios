package beecrowd;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int p1,n1, p2, n2;
            double v1,v2,valort; 
            p1 = sc.nextInt();
            n1 = sc.nextInt();
            v1 = sc.nextDouble();
            p2 = sc.nextInt();
            n2 = sc.nextInt();
            v2 = sc.nextDouble();
            valort = v1 * n1 +  v2 * n2;
            System.out.printf("VALOR  A PAGAR: R$ %.2f\n", valort);
        sc.close();
    }
}
