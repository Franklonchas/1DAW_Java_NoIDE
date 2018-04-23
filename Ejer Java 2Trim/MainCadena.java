public class MainCadena{
	public static void main(String[] args){

		Cadena c = new Cadena("hola");
		Cadena prueba = new Cadena("mtqf");/*hola encriptado*/

		System.out.println(c.invierteCadena());
		System.out.println(c.encriptaCadena());
		System.out.println(prueba.desencriptaCadena());
		c.visualizaCadena();
		prueba.visualizaCadena();

	}
}
