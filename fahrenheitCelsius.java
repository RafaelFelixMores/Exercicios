package exercicios;

public class fahrenheitCelsius {
	
	public static void main(String[] args) {
		double fahrenheit = 86;
		double celsius = 0;
		final double subtractFahrenheit = 32;
		final double calcFahrenheit = 5.0/9.0;
		celsius = (fahrenheit - subtractFahrenheit) * calcFahrenheit;
		
		System.out.println(celsius);
		
	
	}
}
