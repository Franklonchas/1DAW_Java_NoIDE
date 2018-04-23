public class Reptil extends Animal{

	public Reptil(String cientifico, String vulgar, int npatas){
		super(cientifico,vulgar, npatas);
	}

	public void describete(){
		super.describete();
		System.out.println("Tiene sangre fría.");
	}

}
