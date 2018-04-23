import java.awt.*;
import java.awt.event.*;


public class ControlVentana2 extends Frame{
	
	public ControlVentana2(String titulo){
		super(titulo);
		ControlVentana cv = new ControlVentana();
		this.addWindowListener(cv);
	}
	
	public ControlVentana2(){this("");}


}
