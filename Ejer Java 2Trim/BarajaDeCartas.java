public class BarajaDeCartas extends Carta{

	public int i,j;
	Carta baraja[][] = new Carta[4][10];

	public BarajaDeCartas(){
		for (i=0;i<4;i++ ){
			for (j=0;j<10 ;j++ ){
				i++;j++;
				baraja[i][j]= new Carta(j,i);
			}
		}
	}

	public Carta sacaCarta(){
		int r1= (int) (Math.random()*4+1);
		int r2= (int) (Math.random()*10+1);
		if (quedanCartas()){
			while (baraja[r1][r2]==null){
				r1= (int) (Math.random()*4+1);
				r2= (int) (Math.random()*10+1);
			}
		}
		Carta carta = baraja[i][j];
		baraja[i][j] = null;
		return carta;
	}
	
	
	public void meteCarta(Carta c){
		baraja[c.palo-1][c.numero-1] = c;
	}

	public boolean quedanCartas(){
		for (i=0;i<4 ;i++ ){
			for (j=0;j<10 ;j++ ){
				if (baraja[i][j] != null){
					return true;
				}
			}
		}return false;
	}


}
