public class Combinatorio {
	public static void main(String[] args) {
		System.out.println("introduce primer valor");
		int a=EntradaConsola.leeEntero();

		System.out.println("introduce segundo valor");
		int b=EntradaConsola.leeEntero();

		int faca=1;
		int facb=1;
		int facab=1;

		for (int i=1; i<=a ;i++ ){
			faca*=i;}
		for (int i=1; i<=b ;i++ ){
			facb*=i;}
		for (int i=1; i<=a-b ;i++ ){
			facab*=i;}
		
		System.out.println("Combinatorio de " + a + " sobre " + b + " es " + faca/(facb*facab));
	}
}
