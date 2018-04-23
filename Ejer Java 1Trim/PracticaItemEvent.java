import java.awt.*;
import java.awt.event.*;
 
public class PracticaItemEvent extends Frame{
    private Checkbox c1, c2;
    private Choice ch;
    private List lista;
    private TextArea ta;
    private Panel p1, p2, p3;
 
    public PracticaItemEvent(String title){
        super(title);
        setLayout(new GridLayout(2,1));
        p1 = new Panel(new BorderLayout());
        p2 = new Panel();
        p1.add("North", p2);
        p2.add(new Label("Sexo"));
        p2.add(new Label("Estado Civil"));
        p2.add(new Label("Hijos"));
        p3 = new Panel (new GridLayout(2,1));
        CheckboxGroup CG = new CheckboxGroup();
        c1 = new Checkbox("Hombre", CG, false);
        c2 = new Checkbox("Mujer", CG, false);
        p3.add(c1);
        p3.add(c2);
        p1.add("West", p3);
        ch = new Choice();
        ch.addItem("Soltero");
        ch.addItem("Casado");
        ch.addItem("Viudo");
        ch.addItem("Divorciado");
        p1.add("Center",ch);
        lista = new List();
        lista.addItem("0");
        lista.addItem("1");
        lista.addItem("2");
        lista.addItem("3");
		lista.addItem("4");
        p1.add("East", lista);
        add(p1);
        ta = new TextArea("",30,35,TextArea.SCROLLBARS_BOTH);
        ta.setEditable(false);
        add(ta);
 
        this.addWindowListener(new ControlVentana());
        ch.addItemListener(new ControlItem());
        c1.addItemListener(new ControlItem());
        c2.addItemListener(new ControlItem());
        lista.addItemListener(new ControlItem());
    }
 
	 public PracticaItemEvent(){
		this("");
	 }


    class ControlVentana extends WindowAdapter{
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    }
 
    class ControlItem implements ItemListener{
        public void itemStateChanged(ItemEvent ie){
            ta.append("Elemento seleccionado: " + ie.getItem() +"\n");
        }
    }
 
}