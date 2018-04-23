public class CirculoPractica1 {
    protected double x,y,radio;
 
    public CirculoPractica(double x, double y, double radio){
        this.x=x;
        this.y=y;
        this.radio=radio;
    }
    public CirculoPractica(){
        x=0;y=0;
        radio=1;
    }
    public double area(){
        return Math.PI*radio*radio;
    }
    public double circunferencia(){
        return 2*Math.PI*radio;
    }
}