public class MainRectangulo{
	public static void main(String[] args){

		System.out.print("Introduce x1: ");
		int x1= EntradaConsola.leeEntero();
		System.out.print("Introduce y1: ");
		int y1= EntradaConsola.leeEntero();
		System.out.print("Introduce y2: ");
		int y2= EntradaConsola.leeEntero();
		System.out.print("Introduce x2: ");
		int x2= EntradaConsola.leeEntero();

		Punto p = new Punto(x1,y1);
		Punto q = new Punto(x2,y2);
		
		Punto p2 = new Punto(x1,y1);
		Punto q2 = new Punto(x2,y2);

		Segmento s1 = new Segmento(p,q);
		Segmento  s2 = new Segmento(p2,q2);

		Rectangulo rectangulo = new Rectangulo(s1,s2);

		System.out.println("Area =  " + rectangulo.area() + " Perimetro= " + rectangulo.perimetro());




	}
}
