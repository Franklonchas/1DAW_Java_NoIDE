public class MainLista{
	public static void main(String[] args){
		Lista prueba = new Lista ("Hola");
		System.out.println(prueba.estaVacia());
		prueba.ponPrimero("Me llamo Fran");
		prueba.ponUltimo("Programaci�n 1DAW");
		prueba.extraePrimero();
		prueba.extraeUltimo();
		prueba.visualizaElementos();
		System.out.println(prueba.estaVacia());
	}
}