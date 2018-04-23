public class SerVivo{
	protected String nombreC, nombreV;

	public SerVivo(String nombreC,String nombreV){
		this.nombreC = nombreC;
		this.nombreV = nombreV;
	}

	public SerVivo(){
		this("","");
	}

	public void describete(){
		System.out.println("Nombre cientifico : "+ nombreC);
		System.out.println("Nombre cientifico : "+ nombreV);
	}

	public void setNombreC(String nombreC){
		this.nombreC = nombreC;
	}

	public void setNombreV(String nombreV){
		this.nombreV = nombreV;
	}
}