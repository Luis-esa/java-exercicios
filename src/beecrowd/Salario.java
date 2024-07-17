package beecrowd;
import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		//Escrevendo um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
		Scanner sc = new Scanner(System.in);

		int horasTrabalhadas, funcionario;
		double valorHora, sal;
        System.out.println("Digite o numero do funcionario: ");
		funcionario = sc.nextInt();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
        System.out.println("Indique o valor a ser pago por hora trabalhada:");
		valorHora = sc.nextDouble();
		sal = horasTrabalhadas * valorHora;
		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = U$ %.2f\n", sal);

		sc.close();
	}

}