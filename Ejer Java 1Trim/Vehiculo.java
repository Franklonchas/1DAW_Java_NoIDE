public class Vehiculo {

	protected int x;
	protected int y;
	protected boolean estado;
	protected int direccion;

/*
estado=true encendido//false apagado
direcion n= 1norte//2sur//3este//4oeste
*/

public Vehiculo(){
	this.x=0;
	this.y=0;
	this.estado=false;
	this.direccion=3;
}

public boolean parar(){
this.estado=false;
return estado;
}

public boolean arrancar(){
estado=true;
return estado;
}

public boolean estaArrancado(){
if(estado==true)
	return true;
	else
	return false;
}

public void mover(){
if(estaArrancado())
	switch(direccion){
			case 0: y++;break;
			case 1:y--;break;
			case 2:x++;break;
			case 3:x--;break;
	}
	else
		System.out.println("El vehiculo no esta arrancado.");
}

/* OTRA MANERA DE HACER MOVER()

public void mover(int n){
	if (estaArrancado())
		for(int i=1; i<n; i++)
		mover();
		else
		System.out.println("El vehiculo no esta arrancado.");
}*/

public int getDireccion(){return direccion;}
public int getX(){return x;}
public int getY(){return y;}
public void imprimeEstado(){
System.out.print("Vehiculo con coordenadas " + x + " x e " + y +" y "+ " estando arrancado =" + estado + " con la direccion " + direccion);
}

public void girarDerecha(){
direccion++;
if(direccion == 4)
	direccion=0;
}

public void girarIzquierda(){
direccion--;
if(direccion == -1)
	direccion=3;
}

public void girar(int giro){
if(giro>=0)
	for(int i=1;i<=giro;i++)
	girarDerecha();
	else
		for(int i=1;i<=Math.abs(giro);i++)
		girarIzquierda();
}

}
