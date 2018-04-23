public class MainGUI04{
	public static void main(String[] args){
		GUI04 ventana = new GUI04("Ejemplo de BorderLayout");
		//ventana.pack();
		ventana.setSize(300,200);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
		ventana.setVisible(true);
	}
}
