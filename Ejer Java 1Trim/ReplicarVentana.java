import java.awt.*;
import java.awt.event.*;

public class ReplicarVentana extends Frame{

	private Panel editable;
	private Panel neditable;

	public ReplicarVentana(String titulo){
		super(titulo);
		editable = new Panel();
		neditable = new Panel();
	}

}
