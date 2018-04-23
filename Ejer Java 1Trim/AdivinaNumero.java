public class AdivinaNumero{
	public static void main(String[] args) {
		System.out.println("");
		int desde=1;
		int hasta=100;
		int cont=0;
		boolean acertar=false;
		int n;

		int aleatorio= (int)(Math.random()*100+1);
		
		while (cont<5 && acertar==false){
			System.out.println("introduce numero entre: " + desde + " y " + hasta);
			n=EntradaConsola.leeEntero();
			if (n==aleatorio){
				acertar=true;
				System.out.println("Has acertado malpario! El numero era" + n);
			}else
				if(n>aleatorio){
					hasta=n;
					System.out.println("El numero que has puesto es menor");
				
				}else{
					desde=n;
					System.out.println("El numero que has puesto es mayor");
				}
				cont++;

		}
	}
}
