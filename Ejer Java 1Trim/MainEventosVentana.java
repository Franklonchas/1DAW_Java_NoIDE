public class MainEventosVentana{
	public static void main(String[] args){
		EventosVentana ventana = new EventosVentana("Ejemplo de EventosVentana");
		//ventana.pack();
		ventana.setSize(400,400);
		ventana.setLocationRelativeTo(null);
		//ventana.setResizable(false);
		ventana.setVisible(true);
	}
}