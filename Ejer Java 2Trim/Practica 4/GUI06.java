import java.awt.*;

public class GUI06 extends Frame{
	
	private Button b1, b2;
	private TextArea ta;
	private TextField tf;
	private List lista;
	private Choice ch;
	private Checkbox cb;


	public GUI06(String titulo){
		super(titulo);
		lista = new List();
		for(int i=0; i<=4; i++)
			lista.addItem("Lista-" + i);
		add("East",lista);

		Panel pOeste = new Panel();
		pOeste.setLayout(new GridLayout(2,1));
		b1 = new Button("Boton 1");
		b2 = new Button("Boton 2");
		pOeste.add(b1);
		pOeste.add(b2);
		add("West", pOeste);

		Panel pCentro = new Panel();
		pCentro.setLayout(new BorderLayout());
		pCentro.add("North", new Label("Etiqueta"));
		ta = new TextArea("Area de texto", 10, 20, TextArea.SCROLLBARS_BOTH);
		pCentro.add("Center", ta);
		add("Center", pCentro);

		Panel pSur = new Panel();
		pSur.setLayout(new FlowLayout(FlowLayout.CENTER));
		tf = new TextField("Campo de texto", 20);
		pSur.add(tf);
		cb = new Checkbox("Checkbox");
		pSur.add(cb);
		ch = new Choice();
		ch.addItem("Programacion");
		ch.addItem("Francisco");
		ch.addItem("2º Trimestre");
		ch.addItem("Hola");
		pSur.add(ch);
		add("South",pSur);
	}

	public GUI06(){
	this("");
	}

}

