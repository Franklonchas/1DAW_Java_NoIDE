public class MayorMenor{

	public static void main(String[] args) {
		int mayor;
		int menor;

		System.out.println("Introduce cuantos numeros a comparar");
		int hasta = EntradaConsola.leeEntero();

		System.out.println("Introduce primer numero");
		int n = EntradaConsola.leeEntero();
		mayor=menor=n;
		for(int i=2; i<=hasta; i++){
			System.out.println("Introduce siguiente numero");
			n = EntradaConsola.leeEntero();

			if(n>mayor)
			mayor=n;

			else
				if(n<menor)
				menor=n;
		}
	System.out.println("El numero mayor es " + mayor);
	System.out.println("El numero menor es " + menor);
	}
}