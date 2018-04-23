public class Avion extends Vehiculo{

protected int z;
protected boolean despegado;

public Avion(){
	super();
	z=0;
	despegado=false;
	}

public void despegar(){
	if (estaArrancado()){
		despegado=true;
		z=1;
		}else
			System.out.println("No puede despegar por que no esta arrangado");
	}

public void subir(){
	if (despegado==true)
		z++;
		else
			System.out.println("No puede subir por que no esta arrancado");
	}


public void subir(int n){
	if (despegado==true)
		z+=n;
}

public void bajar(){
	if(despegado==true && z>0)
		z--;
	}

public void bajar(int n){
	if (despegado==true){
		z-=n;
		if(z<0)
			z=0;
	}
}

public void imprimeEstado(){
super.imprimeEstado();
System.out.println("Es un avion");
System.out.println("Despegado= " + despegado);
System.out.println("La coordenada z= " + z);
}

}
