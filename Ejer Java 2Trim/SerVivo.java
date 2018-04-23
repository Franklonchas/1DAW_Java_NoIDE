public class SerVivo{

	protected String nombreCientifico;
	protected String nombreVulgar;

	public SerVivo(String cientifico, String vulgar){
		nombreVulgar=vulgar;
		nombreCientifico=cientifico;
	}

	public SerVivo(){
		nombreCientifico="";
		nombreVulgar="";
	}

	public void describete(){
		System.out.println("Nombre cientifico: " + nombreCientifico);
		System.out.println("Nombre vulgar: " + nombreVulgar);
	}

	public void setNombreCientifico(String cientifico){
		nombreCientifico=cientifico;
	}

		public void setNombreVulgar(String vulgar){
		nombreVulgar=vulgar;
	}
}
