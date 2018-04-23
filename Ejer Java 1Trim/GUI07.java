import java.awt.*;
public class GUI07 extends Frame{
	
	private ScrollPane sp; 

	public GUI07(String titulo){
		super(titulo);
		sp = new ScrollPane(ScrollPane.SCROLLBARS_AS_NEEDED);
		Panel p = new Panel();
		p.setLayout(new GridLayout(5,3));
		for (int i=1;i<=15 ;i++ ){
			p.add(new Button("Boton-" + i));
		}		
		sp.add(p);
		add(sp);		
	}

	public GUI07(){
		this("");
	}

}
