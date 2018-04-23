public class Punto{
	private int x;
	private int y;

/*Constructor por defecto*/
	public Punto(int x, int y){
		this.x=x;
		this.y=y;
	}

	public double distancia (int px, int py){
		double var = Math.sqrt(((px-x)*(px-x))+((py-y)*(py-y)));
			return var;
	}

	public double distancia(Punto p){
		double var = Math.sqrt(((p.x-x)*(p.x-x))+((p.y-y)*(p.y-y)));
			return var;
	}


	public int getX() {return this.x;}
	public int getY() {return this.y;}

}
