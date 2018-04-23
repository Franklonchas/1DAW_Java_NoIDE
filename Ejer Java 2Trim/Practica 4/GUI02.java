import java.awt.*;

public class  GUI02 extends Frame{
	
	private Button bNorte, bSur, bEste, bOeste, bCentro;

	public GUI02(String titulo){
	super(titulo);
	bNorte = new Button("Norte");
	bSur = new Button("Sur");
	bEste = new Button("Este");
	bOeste = new Button("Oeste");
	bCentro = new Button("Centro");

	add("North", bNorte);
	add("South", bSur);
	add("East", bEste);
	add("West", bOeste);
	add("Center", bCentro);
	}

	public GUI02(){
	this("");
	}
}
