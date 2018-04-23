import java.awt.*;
import java.awt.event.*;

public class EventosTeclado extends Frame{
	
	private TextArea ta1, ta2;

	
	public EventosTeclado(String titulo){
		super(titulo);
		setLayout(new GridLayout(2, 1));
		ta1 = new TextArea("",5,20,TextArea.SCROLLBARS_BOTH);
		ta2 = new TextArea("",5,20,TextArea.SCROLLBARS_BOTH);
		ta2.setEditable(false);
		add(ta1);
		add(ta2);
		addWindowListener( new ControlVentana());
		ta1.addKeyListener(new ControlTeclado());
		
	}
	public EventosTeclado(){this("");}

	class ControlVentana extends WindowAdapter{
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}

	}
	class ControlTeclado extends KeyAdapter{
		public void keyPressed(KeyEvent ke){
			if(ke.getKeyChar()==8)
				ta2.replaceRange("", ta1.getCaretPosition(), ta1.getCaretPosition()-1);
			else
				if(ke.getKeyChar()>= 0 && ke.getKeyChar()<256 && ke.getKeyChar()!=27)
					ta2.append("" + ke.getKeyChar());

		}
	}
	
	
	
	
}