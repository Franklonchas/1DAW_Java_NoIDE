public class Animal extends SerVivo {

	protected int numpatas;

	public Animal(String cientifico, String vulgar, int npatas){
		super(cientifico,vulgar);
		numpatas=npatas;
	}

	public Animal(){
		super();
		numpatas=0;
	}

	public String getNombreCientifico(){
		return nombreCientifico;
	}

	public String getNombreVulgar(){
		return nombreVulgar;
	}

	public int getNumeroPatas(){
		return numpatas;
	}

	public void setNumeroPatas(int npatas){
		numpatas=npatas;
	}

	public void describete(){
		super.describete();
		System.out.println("Puedo moverme.");
		System.out.println("Numero de patas: " + numpatas);
	}
}