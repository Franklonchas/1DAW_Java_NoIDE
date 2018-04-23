/*
Haced un programa para calcular el factorial de un número natural positivo.
*/

public class FactorialNumeroPositivo{
	int resultado = 0;
	public static void main(String[] args) {
		
		System.out.println("Introduce el numero");
		int n = EntradaConsola.leeEntero();
		
		for(int i=0; i<=n; i++){
			int resultado = (n * i);
			System.out.println(resultado * i);
			System.out.println("El resultado es " + resultado);
		}
		
	}
}