public class MainGUI05{
	public static void main(String[] args){
		GUI05 ventana = new GUI05("Ejemplo de BorderLayout");
		//ventana.pack();
		ventana.setSize(300,200);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
		ventana.setVisible(true);
	}
}
