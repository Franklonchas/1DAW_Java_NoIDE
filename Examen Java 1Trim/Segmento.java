public class Segmento {
    public Punto p;
    public Punto q;

    public Segmento(Punto p, Punto q) {
        this.p = p;
        this.q = q;
    }

    public double longitudSegmento() {
        return this.p.distancia(this.q);
    }

	public Punto getPuntoP() {return this.p;}
	public Punto getPuntoQ() {return this.q;}
}