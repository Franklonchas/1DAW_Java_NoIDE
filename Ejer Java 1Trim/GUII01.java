import java.awt.*;
class GUII01 extends Frame{

	private Button bNO, bSI;
	private Label l;

	public GUII01(String titulo){
		super(titulo);
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		bSI = new Button("SI");
		bNO = new Button("NO");
		l = new Label("Nombre");
		this.add(l);
		this.add(bSI);
		this.add(bNO);
	}

	public GUII01(){
		super();
	}

}