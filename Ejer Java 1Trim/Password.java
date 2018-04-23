import java.awt.*;
import java.awt.event.*;

public class Password extends Frame{
	
	private Button b,aceptar,cancelar;
	private Label usu,pass;
	private TextField tfU,tfP;
	private Dialog d;
	private Label l;

	public Password (String titulo){
		super(titulo);
		setLayout(new FlowLayout());
		b = new Button("Pulse aqui");
		add(b);
		d = new Dialog(this, "Ventana de dialogo", true);
		d.setLayout(new GridLayout(4,1));
		d.add(new Label(""));

		Panel p1 = new Panel();
		p1.add(new Label("          "));
		p1.add(new Label("Usuario", Label.RIGHT));
		tfU = new TextField ("Pepe", 15);
		p1.add(tfU);
		p1.add(new Label("          "));
		aceptar = new Button("Aceptar");
		p1.add(aceptar);
		d.add(p1);

		Panel p2 = new Panel();
		p2.add(new Label("          "));
		p2.add(new Label("Password", Label.RIGHT));
		tfP = new TextField ("*****", 15);
		tfP.setEchoChar('*');
		p2.add(tfP);
		p2.add(new Label("          "));
		cancelar = new Button("Cancelar");
		p2.add(cancelar);
		d.add(p2);
		d.add(new Label(""));

		this.addWindowListener(new controlVentana());
		d.addWindowListener(new controlVentana());

		b.addActionListener(new ControlBoton());
	}

	public Password(){this("");}

	class controlVentana implements WindowListener{

		public void windowActivated(WindowEvent we){}
		public void windowDeactivated(WindowEvent we){}
		public void windowClosed(WindowEvent we){}
		public void windowClosing(WindowEvent we){
			if (we.getSource() == d){
				d.show(false);
			}
			else System.exit(0);
		}
		public void windowIconified(WindowEvent we){}
		public void windowDeiconified(WindowEvent we){}
		public void windowOpened(WindowEvent we){}
	}

	class ControlBoton implements ActionListener{
		public void actionPerformed(ActionEvent e){
			d.pack();
			d.setLocation(400,350);
			d.show(true);
		}
					
	}

}
