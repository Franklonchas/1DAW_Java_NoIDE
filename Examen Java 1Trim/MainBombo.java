public class MainBombo {
	public static void main(String[] args) {
		int numero1,numero2,numero3,numero4,numero5,numero6;
		Bombo bombo = new Bombo(49);
		numero1= bombo.sacaBola();
		numero2= bombo.sacaBola();
		numero3= bombo.sacaBola();
		numero4= bombo.sacaBola();
		numero5= bombo.sacaBola();
		numero6= bombo.sacaBola();

		System.out.println("Y los numero premiados son: " + numero1 + " / " + numero2 + " / " + numero3 
		+ " / " + numero4 + " / " + numero5 + " / " + numero6);
	}
}

