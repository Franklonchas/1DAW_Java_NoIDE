import java.awt.*;

public class GUI05 extends Frame{
	
	private Button bNorte, bCentro, bEste, bPanel1, bPanel2, bSur;

	public GUI05(String titulo){
		super(titulo);
		add("North", new Button("Norte"));
		add("East", new Button("Este"));
		add("Center", new Button("Centro"));
		add("South", new Button("Sur"));
		Panel pOeste = new Panel();
		pOeste.setLayout(new GridLayout(2,1));
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("CB1", cbg, false);
		Checkbox cb2 = new Checkbox("CB2", cbg, true);
		pOeste.add(cb1);
		pOeste.add(cb2);
		add("West", pOeste);
	}

	public GUI05(){this("");}
}
