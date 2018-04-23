public class Mamifero extends Animal{
	
	protected String familia;

	public Mamifero(String cientifico, String vulgar, String familia, int npatas){
		super(cientifico, vulgar, 4);
		this.familia=familia;
	}
	
	public void setNumPatas(int nPatas){
		System.out.println("MEEEC!!");
	}

	public void describete(){
		super.describete();
		System.out.println("Mi familia es: " + familia);
	}

}
