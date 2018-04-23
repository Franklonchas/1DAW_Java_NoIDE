public class Cadena{
	
	String c="";

	public Cadena(String c){
		this.c = c;
	}

	public String invierteCadena(){
		String aux = "";
		for (int i = c.length()-1; i>=0 ;i--){
			aux+=c.charAt(i);
		}return aux;
	}

	public String encriptaCadena(){
		String cadenafinal="";
		for (int i=0; i <= c.length()-1; i++){
			int ascii = (int)c.charAt(i);
			ascii+=5;
			char car = (char)ascii;
			cadenafinal+=car;
		}return cadenafinal;
	}

	public String desencriptaCadena(){
		String cadenafinal="";
		for (int i=0; i <= c.length()-1; i++){
			int ascii = (int)c.charAt(i);
			ascii-=5;
			char car = (char)ascii;
			cadenafinal+=car;
		}return cadenafinal;
	}
	
	public void visualizaCadena(){
		System.out.println(c);
	}

}
