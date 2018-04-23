public class BarajaDeCartas2{
	protected Carta baraja [] [];

	public BarajaDeCartas2(){
		baraja = new Carta [4] [10];
		for(int=0;i<=3;i++)
			for(int j=0;j<=9;j++)
				baraja[i][j]=new Carta(j+1,i+1);
	}

	public Carta sacaCarta(){
		int i=0;
		int j=0;
		if(quedanCartas()){
			i=(int)(Math.random()*4);
			j=(int)(Math.random()*10);
		}
	}
	Carta carta = baraja[i][j];
	baraja [i][j] = null;
	return carta;}

	public void meteCarta(){
		for (int i=0;i<=3 ;i++ )
		{
		}
	}

	public boolean quedanCartas(){
		for(int i=0; i<=3;i++){
			for(int j=0;j<=9;j++){
				if (baraja[i][j] !=null){
				return true;
				}
			}
			return false;
		}
	}
}
