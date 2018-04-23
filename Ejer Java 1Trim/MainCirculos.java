class MainCirculos {
	public static void main(String[] args) {

		System.out.print("Introduce coordenada X: ");
		double x=EntradaConsola.leeReal();
		System.out.print("Introduce coordenada Y: ");
		double y=EntradaConsola.leeReal();
		System.out.print("Introduce el radio: ");
		double r=EntradaConsola.leeReal();

		Circulo circulo1 = new Circulo(x,y,r);
		System.out.println("Area= " + circulo1.Area());
		System.out.println("Circunferencia= " + circulo1.Circunferencia());

		Circulo circulo2 = new Circulo();
		System.out.println("Area= " + circulo2.Area());
		System.out.println("Circunferencia= " + circulo2.Circunferencia());

		System.out.println("Se han creado" + circulo1.getNumCirculos() + " circulos");

	}
}