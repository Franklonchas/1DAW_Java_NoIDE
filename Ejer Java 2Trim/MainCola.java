public class  MainCola{
	public static void main(String[] args){
		Cola colaprueba = new Cola();
		System.out.println(colaprueba.vacia());
		colaprueba.ponEnCola(2);
		System.out.println(colaprueba.vacia());
		colaprueba.ponEnCola(3);
		colaprueba.extraeDeCola();
		System.out.println(colaprueba.frente());
		System.out.println(colaprueba.vacia());
	}
}
