import java.awt.*;

public class MainGUII01{
	public static void main(String[] args){
		GUII01 ventana = new GUII01("Ejemplo de GUII01");
		//ventana.pack();
		ventana.setSize(300,100);
		ventana.setLocation(300,300);
		ventana.setVisible(true);

		GUII01 ventana2 = new GUII01("Ejemplo de GUII01");
		ventana2.pack();
		//ventana2.setSize(200,100);
		ventana2.setLocation(50,30);
		ventana2.setVisible(true);

	}
}
