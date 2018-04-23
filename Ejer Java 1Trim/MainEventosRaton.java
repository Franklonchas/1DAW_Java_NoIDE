public class MainEventosRaton{
	public static void main(String[] args){
		EventosRaton ventana = new EventosRaton("Ejemplo de EventoRaton");
		//ventana.pack();
		ventana.setSize(450,250);
		ventana.setLocationRelativeTo(null);
		//ventana.setResizable(false);
		ventana.setVisible(true);
	}
}