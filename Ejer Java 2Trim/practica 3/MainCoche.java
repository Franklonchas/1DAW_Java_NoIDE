public class MainCoche{
	public static void main(String[] args) 
	{
		System.out.println("Introduce la marca del coche: ");
		String marca=EntradaConsola.leeCadena();

		System.out.println("Introduce la matricula del coche: ");
		String matricula=EntradaConsola.leeCadena();

		System.out.println("Introduce la color del coche: ");
		String color=EntradaConsola.leeCadena();

		Coche coche = new Coche(marca,matricula,color);
		coche.imprimeEstado();
	}


}
