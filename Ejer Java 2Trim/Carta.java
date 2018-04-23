public class Carta{
	protected int numero,palo;
	public Carta(){
		numero=(int)(Math.random()*10)+1;
		palo=(int)(Math.random()*4)+1;
	}
	public Carta(int numero, int palo){
		this.numero=numero;
		this.palo=palo;
	}

	public String getStringPalo() {
		switch(this.palo) {
			case 1:
				return "oros";
			case 2:
				return "copas";
			case 3:
				return "espadas";
			case 4:
				return "bastos";
			default:
				return null;
		}
	}

public String getStringNumero() {
		switch(this.numero) {
			case 8:
				return "sota";
			case 9:
				return "caballo";
			case 10:
				return "rey";
			default:
				return String.valueOf(this.numero);
		}
	}
	public void visualizarCarta(){
		System.out.println("El "+this.getStringNumero()+ "de "+this.getStringPalo());
	}
	public int valorCarta(){
		return numero;
	}
}
