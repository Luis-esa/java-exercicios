package beecrowd;

import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[] args) {
        //Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite o nome do vendedor: ");
            String name = sc.nextLine();
            double salary, sales,comission, total; 
            System.out.println("Digite seu salario fixo: ");
            salary = sc.nextDouble();
            System.out.println("Digite o total de vendas feitas por "+name+":");
            sales = sc.nextDouble();
            comission = 0.15; 
            total = salary + (comission * sales);
            System.out.printf("TOTAL A RECEBER : R$ %.2f\n",total);
        sc.close();

    }
}