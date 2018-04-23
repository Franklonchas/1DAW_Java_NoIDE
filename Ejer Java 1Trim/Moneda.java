public class Moneda {
	public static void main(String[] args) {
		char continuar;
		do{
			int moneda = (int)(Math.random()*2);

			if (moneda==0)
				System.out.println("Cara");
			else
				System.out.println("Cruz");
				System.out.println("Deseas continuar(S/N): ");
				continuar=EntradaConsola.leeCaracter();
				
		}while (continuar=='S' || continuar=='s');
	}
}