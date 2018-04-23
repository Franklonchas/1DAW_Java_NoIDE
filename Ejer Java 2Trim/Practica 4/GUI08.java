import java.awt.*;
import java.awt.event.*;

public class GUI08 extends Frame{

	private MenuItem mi1, mi2, mi3, mi4;
	private Menu menu1, menu2, menu3, menu4;
	private MenuBar mb;

	public GUI08(String titulo){
		super(titulo);
		mb = new MenuBar();
		setMenuBar(mb);
		menu1 = new Menu("Entrada 1");
		menu2 = new Menu("Entrada 2");
		menu3 = new Menu("Ayuda pls");
		mb.add(menu1);
		mb.add(menu2);
		mb.add(menu3);

		mi1= new MenuItem("Subentrada 1.1");
		menu1.add(mi1);
		menu1.addSeparator();
		mi2= new MenuItem("Subentrada 1.2", new MenuShortcut(KeyEvent.VK_E));
		menu1.add(mi2);
		menu4 = new Menu("Subentrada 1.3");
		menu1.add(menu4);
		mi3 = new MenuItem("Subentrada 1.3.1");
		menu4.add(mi3);
		mi4 = new MenuItem("Subentrada 1.3.2");
		menu4.add(mi4);

	}

	public GUI08(){
		this("");
	}

}
