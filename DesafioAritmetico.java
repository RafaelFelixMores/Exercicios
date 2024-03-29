package exercicios;

public class DesafioAritmetico {
	public static void main(String[] args) {		
		//int b = (int) Math.pow(a, 3);
		
		/*
		 * [6*(3+2)]^2    -   (1-5)*(2-7)^2    ^3
		 * 	  3*2					2
		 * 				10^3
		 * 	
		 * 
		 * 150-100^3				50^3
		 * 	  10^3					10^3   = 125
		*/
		
		//Primeira parte do calculo [6*(3+2)]^2 /2
		int first = 6*(3+2);
		first = (int) Math.pow(first, 2);
		first = first / (3*2);
		System.out.println("Primeira parte "+first+".");
		
		//Segunda parte do calculo (1-5)*(2-7)^2 /2
		int second = (1-5) * (2-7);
		second = second / 2;
		second = (int) Math.pow(second, 2);
		System.out.println("Segunda parte "+second+".");
		
		
		//Terceira parte do calculo
		int third = first - second;
		System.out.println("Terceira parte "+third+".");
		third = (int) Math.pow(third, 3);
		
		
		//Resolvendo parte final
		int fourth = (int) Math.pow(10, 3);		
		int fifth = third / fourth;
		
		
		System.out.println("Resultado final "+fifth+".");		
		
		
	}

}
