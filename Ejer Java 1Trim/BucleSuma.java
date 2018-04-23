public class BucleSuma{

	public static void main(String[] args) {
		int contadorsuma = 0;
		System.out.println("Introduce el primer numero");
		int n = EntradaConsola.leeEntero();
		System.out.println("Introduce el segundo numero");
		int m = EntradaConsola.leeEntero();
		for(int i=n; i<=m; i++){
		System.out.println("La suma de " + i + " y de "+ contadorsuma + " es "+ (i+contadorsuma));
		contadorsuma = contadorsuma + i;
		}
		System.out.println("El resultado es " + contadorsuma);
	}
}