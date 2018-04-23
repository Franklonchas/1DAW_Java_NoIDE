public class MainCocheAcuatico{
	public static void main(String[] args) {
		System.out.println("Introduce la marca: ");
		String marca = EntradaConsola.leeCadena();

		System.out.println("Introduce la matricula: ");
		String matricula = EntradaConsola.leeCadena();

		System.out.println("Introduce el color: ");
		String color = EntradaConsola.leeCadena();

		CocheAcuatico coche = new CocheAcuatico(marca, matricula, color);
		coche.imprimeEstado();
	}
}
