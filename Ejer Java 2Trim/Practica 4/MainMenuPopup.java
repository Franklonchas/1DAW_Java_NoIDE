public class MainMenuPopup{
	public static void main(String[] args){
		MenuPopup ventana = new MenuPopup("Ejemplo de MenuPopup");
		//ventana.pack();
		ventana.setSize(200,150);
		ventana.setLocationRelativeTo(null);
		//ventana.setResizable(false);
		ventana.setVisible(true);
	}
}