public class MainGUI02{
	public static void main(String[] args){
		GUI02 ventana = new GUI02("Ejemplo de BorderLayout");
		//ventana.pack();
		ventana.setSize(300,200);
		ventana.setLocation(300,300);
		ventana.setResizable(false);
		ventana.setVisible(true);
	}
}