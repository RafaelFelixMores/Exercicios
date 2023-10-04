package exercicios;

public class DesafioLogico {
	public static void main(String[] args) {
		//trabalho tarça (V ou F)
		//trabalho tarça (V ou F)
		
		boolean trabalhoTerca = false;
		boolean trabalhoQuinta = false;
		
		if(trabalhoTerca && trabalhoQuinta) {
			System.out.println("Vamos comprar a televisao de 50 polegadas!");
			System.out.println("Vamos tomar sorvete!");
		}else if(trabalhoTerca || trabalhoQuinta) {
			System.out.println("Vamos comprar a televisao de 32 polegadas!");
			System.out.println("Vamos tomar sorvete!");
		}else if(!trabalhoTerca && !trabalhoQuinta) {
			System.out.println("Vamos ficar em casa e fazer comida!");
		}
		
		
	}
	
}
