package exercicios;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite o primeiro salario: ");		
		String salario1 = entrada.nextLine().replace(",", ".");
		System.out.printf("Digite o segundo salario: ");
		String salario2 = entrada.nextLine().replace(",", ".");

		System.out.printf("Digite o terceiro salario: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		double salarioReal1 = Double.parseDouble(salario1);
		double salarioReal2 = Double.parseDouble(salario2);
		double salarioReal3 = Double.parseDouble(salario3);
		
		double mediaSalarios = (salarioReal1 + salarioReal2 + salarioReal3)/3;
		
		System.out.println(mediaSalarios);
		
		
		
		
		entrada.close();
	}

}
