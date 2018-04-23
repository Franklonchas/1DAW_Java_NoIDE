import java.awt.*;
import java.awt.event.*;

public class EventoFoco extends Frame{

	private TextField tf;
	private Button boton;
	private List lista;
	private TextArea ta;
	private Choice ch;
	
	public EventoFoco(String titulo){
		super(titulo);
		setLayout(new GridLayout(2,1));
		Panel pNorte = new Panel();
		pNorte.setLayout(new BorderLayout());
		Panel panel = new Panel();
		tf = new TextField(15);
		panel.add(tf);
		panel.add(new Label("Etiqueta"));
		ch = new Choice();

		for(int i=1;i<=5;i++)
			ch.addItem("Item " + i);
		panel.add(ch);
		boton = new Button("Boton");
		panel.add(boton);
		pNorte.add("North", panel);
		lista = new List();

		for(int i=1;i<=5;i++)
			lista.addItem("Lista " + i);
		pNorte.add("Center", lista);
		add(pNorte);
		ta = new TextArea(10,50);
		ta.setEditable(false);
		add(ta);
		this.addWindowListener(new ControlVentana());

		tf.addFocusListener(new ControlFoco());
		ch.addFocusListener(new ControlFoco());
		boton.addFocusListener(new ControlFoco());
		lista.addFocusListener(new ControlFoco());
	}

	public EventoFoco(){
		super("");
	}
	
	class ControlVentana extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}

	class ControlFoco extends FocusAdapter{
		public void focusGained(FocusEvent fe){
			ta.append("Foco ganado: " + fe.getSource() + "\n");			
		}

		public void focusLost(FocusEvent fe){
			ta.append("Foco perdido: " + fe.getComponent() + "\n");
		}
	}
}