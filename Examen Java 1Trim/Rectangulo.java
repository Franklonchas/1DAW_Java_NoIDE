public class Rectangulo {
    private Segmento s1;
    private Segmento s2;
 
    public Rectangulo(Segmento s1, Segmento s2) {
        if( (s1.getPuntoP().getX() != s2.getPuntoP().getX()) && 
			(s1.getPuntoQ().getY() != s2.getPuntoQ().getY()) ){
            System.out.println("No es valido");
        } 
		else{
            this.s1 = s1;
            this.s2 = s2;
        }
    }
 
    public double area() {
        return s1.longitudSegmento()*s2.longitudSegmento();
    }
 
    public double perimetro() {
        return s1.longitudSegmento()*2 + s2.longitudSegmento()*2;
    }

}