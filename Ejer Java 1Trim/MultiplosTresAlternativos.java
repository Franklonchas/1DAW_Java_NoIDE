public class MultiplosTresAlternativos{

	public static void main(String[] args) {
		boolean imprime=true;

		System.out.println("Introduce desde que numero");
		int desde = EntradaConsola.leeEntero();

		System.out.println("Introduce hasta que numero");
		int hasta = EntradaConsola.leeEntero();
		
		for (int i=desde; i<=hasta ; i++ ){
			if(i%3==0)	{
				if (imprime==true){
					System.out.println(i);
				}else{
					imprime=true;
				}
			}
		}
	}
}