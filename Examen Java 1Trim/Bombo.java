public class  Bombo{

	private int n;

	public Bombo(int n){
	this.n=n;
	}

	public int sacaBola(){
		int bolafuera= (int) (Math.random()*this.n+1);
		this.n-=1;
		return bolafuera;
	}

	public void meteBola(int bola){
		this.n+=n;
	}

	public boolean quedanBolas(){
		if(n<=1)
			return true;
		else
			return false;
	}

	 public int totalBolas() {
        return this.n;
    }
}
