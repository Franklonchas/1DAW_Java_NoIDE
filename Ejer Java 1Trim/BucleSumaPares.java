public class BucleSumaPares{

	public static void main(String[] args) {
		int contadorsuma = 0;
		System.out.println("Introduce el numero");
		int n = EntradaConsola.leeEntero();
		
		for(int i=0; i<n; i = i + 2){
		System.out.println(i);
		contadorsuma = contadorsuma + i;
		}
		System.out.println("El resultado es " + contadorsuma);
	}
}