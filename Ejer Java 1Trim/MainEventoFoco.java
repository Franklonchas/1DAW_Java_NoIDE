public class MainEventoFoco{
	public static void main(String[] args){
		EventoFoco ventana = new EventoFoco("Ejemplo de EventoFoco");
		//ventana.pack();
		ventana.setSize(450,350);
		ventana.setLocationRelativeTo(null);
		//ventana.setResizable(false);
		ventana.setVisible(true);
	}
}