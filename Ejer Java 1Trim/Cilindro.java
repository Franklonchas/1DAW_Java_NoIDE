public class Cilindro extends CirculoPractica1 {
    protected double altura;
   
    public Cilindro(double x, double y,double radio, double altura){
        super(x, y,radio);
        this.altura = altura;
    }
   
    public Cilindro(){
    this(1.0,2.0,3.0,4.0);
    }
   
    public double volumen(){
    return super.area()*altura;
    }
   
    public double area(){
    return 2*super.area()+circunferencia()*altura;
    }
}