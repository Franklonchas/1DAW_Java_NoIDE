import java.awt.*;

public class  GUI03 extends Frame{

	private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;

	public GUI03(String titulo){
		super(titulo);
		this.setLayout(new GridLayout(5,2));
		for (int i=1;i<=10 ; i++){
			add(new Button ("Botón " + i));
		}
	}

	public GUI03(){
	super("");
	}
}
