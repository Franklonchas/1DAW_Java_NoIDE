public class Circulo {
		/* Declaracion de las variables*/
		private double x, y, r;
		private static int numCirculos;

		public Circulo(){ /*Constructor por defecto*/
		x=0.0;
		y=0.0;
		r=1.0;
		numCirculos++;
		}

		public Circulo(double x, double y, double r){
		this.x = x;
		this.y= y;
		this.r= r;
		numCirculos++;
		}

		public double Area(){
		return Math.PI*r*r;
		}

		public double Circunferencia(){
		return 2*Math.PI*r;
		}

		public double getx(){
		return x;
		}

		public double gety(){
		return y;
		}

		public double getradio(){
		return r;
		}

		public double getNumCirculos(){
		return numCirculos;
		}
}
