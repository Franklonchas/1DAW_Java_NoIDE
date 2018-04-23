public class MainMatriz{
	public static void main(String[] args){
		int m[][] = new int[10][10];
		int contador=1;
		for (int fila=0;fila<10;fila++)
			for(int col=0;col<10;col++)
			m[fila][col]=contador++;
		for(int fila=0; fila<10; fila++)
			for (int col=0;col<10 ;col++ )
				System.out.print(m[fila][col] + "  ");
		System.out.println();
	}
}
