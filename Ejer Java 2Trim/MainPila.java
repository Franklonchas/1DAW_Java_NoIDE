public class MainPila{
	public static void main(String[] args) {
		Pila pilaprueba = new Pila();
		System.out.println(pilaprueba.vacia());
		pilaprueba.push(2);
		System.out.println(pilaprueba.vacia());
		pilaprueba.push(3);
		pilaprueba.pop();
		System.out.println(pilaprueba.vacia());
		System.out.println(pilaprueba.cima());
	}
}
