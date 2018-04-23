import java.awt.*;
import java.awt.event.*;
 
public class MenuPopup extends Frame{
    private PopupMenu popup;
    private Panel p;
    public MenuPopup(String titulo){
        super(titulo);
        p = new Panel();
        add(p);
        popup = new PopupMenu();
        MenuItem m1 = new MenuItem("Copiar      ");
        popup.add(m1);
        MenuItem m2 = new MenuItem("Cortar      ");
        popup.add(m2);
        MenuItem m3 = new MenuItem("Pegar      ");
        popup.add(m3);
        p.add(popup);
        addWindowListener(new ControlVentana());
        p.addMouseListener(new ControlRaton());
    }
    public MenuPopup(){
        this("Ejemplo de Menu Popup");
    }
    class ControlVentana extends WindowAdapter {
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    }
    class ControlRaton extends MouseAdapter{
        public void mouseReleased(MouseEvent e){
            if(e.getButton()==MouseEvent.BUTTON3)
                popup.show(p, e.getX(),e.getY());
        }
    }
}