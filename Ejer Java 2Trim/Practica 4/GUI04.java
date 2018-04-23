import java.awt.*;

public class GUI04 extends Frame{
	
	private Button bNorte, bCentro, bEste, bPanel1, bPanel2;

	public GUI04(String titulo){
		super(titulo);
		add("North", new Button("Norte"));
		add("East", new Button("Este"));
		add("Center", new Button("Centro"));
		Panel pOeste = new Panel();
		pOeste.setLayout(new GridLayout(2,1));
		pOeste.add(new Button("Panel 1"));
		pOeste.add(new Button("Panel 2"));
		add("West", pOeste);
	}

	public GUI04(){this("");}
}
