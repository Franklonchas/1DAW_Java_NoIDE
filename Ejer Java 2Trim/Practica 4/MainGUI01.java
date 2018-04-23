public class MainGUI01{
	public static void main(String[] args){
		GUI01 ventana = new GUI01("Ejemplo de BorderLayout");
		//ventana.pack();
		ventana.setSize(300,200);
		ventana.setLocation(300,300);
		ventana.setResizable(false);
		ventana.setVisible(true);
	}
}