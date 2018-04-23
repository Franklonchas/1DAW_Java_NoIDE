public class  PositivosNegativos {
	public static void main(String[] args) {
		int positivos = 0;
		int negativos =0;
		int n=-1;
		
		while(n!=0){
		System.out.println("Introduce un numero");
		n = EntradaConsola.leeEntero();
		if(n>=0){
			positivos++;}
		else{
			if(n<0)
				negativos++;}
		}
		System.out.println("Hay " + positivos + " numeros positivos y " + negativos +" numeros negativos.");
	}
}
