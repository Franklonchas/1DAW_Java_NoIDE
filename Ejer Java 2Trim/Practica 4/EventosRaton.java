import java.awt.*;
import java.awt.event.*;

public class EventosRaton extends Frame{

	private TextArea ta;

	public EventosRaton(String titulo){
		super(titulo);
		setLayout(new GridLayout(2,1));
		Panel p1 = new Panel();
		p1.setBackground(new Color(0,255,0));
		add(p1);
		ta = new TextArea("",5,20,TextArea.SCROLLBARS_BOTH);
		add(ta);

		addWindowListener(new ControlVentana());
		p1.addMouseListener(new ControlRaton());
		p1.addMouseMotionListener(new ControlRaton());
	}

	public EventosRaton(){
		this("");
	}

	class ControlVentana extends WindowAdapter{

		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}

	class ControlRaton implements MouseListener, MouseMotionListener{

		public void mouseClicked(MouseEvent me){
			ta.append("Boton clicado\n");
		}
		public void mouseEntered(MouseEvent me){
			ta.append("Entrada Zona de Control\n");
		}
		public void mouseExited(MouseEvent me){
			ta.append("Salida de la Zona de Control\n");
		}
		public void mousePressed(MouseEvent me){
			if(me.getButton()==MouseEvent.BUTTON1)
				ta.append("Boton Izquierdo pulsado");
				else
					if(me.getButton()==MouseEvent.BUTTON2)
						ta.append("Boton Central pulsado");
						else
							ta.append("Boton Derecho pulsado");
		}
		public void mouseReleased(MouseEvent me){
			ta.append("Boton librerado\n");
		}


		public void mouseDragged(MouseEvent me){
			ta.append("Componente arrastrado\n");
		}
		public void mouseMoved(MouseEvent me){
			ta.append("X: " + me.getX() + " Y: " + me.getY() + "\n");
		}
	}

}
