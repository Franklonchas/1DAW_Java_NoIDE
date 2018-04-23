public class CocheAcuatico2 extends Coche implements Sumergible {
	protected int z;
	protected boolean inmerso; //true inmerso
	protected boolean medio; // true en el agua

	public CocheAcuatico2(String marca, String matricula, String color){
	super(marca, matricula, color);
	z=0;
	inmerso=false;
	medio=false;
	}

	public boolean estaInmerso(){return inmerso;}
	public boolean estaEnElAgua(){return medio;}
	public void imprimeEstado(){
		super.imprimeEstado();
		System.out.println("La coordenada z= " + z);
		if(estaInmerso())
			System.out.println("El coche esta inmerso");
			else
				System.out.println("El coche no esta inmerso");
		if(estaEnElAgua())
			System.out.println("El coche esta en el agua");
			else
				System.out.println("El coche no en el agua");
	}

	public void descender(int n){
		if(estaArrancado() && estaEnElAgua() && estaInmerso())
			z-=n;
	}
	
	public void ascender(int n){
		if(estaArrancado() && estaEnElAgua() && estaInmerso()){
			z+=n;
			if(z<0)
				z=0;
		inmerso=false;
		}
	}
	
	public void inmersion(){
		if(estaArrancado() && estaEnElAgua()){
		inmerso=true;
		z=-1;
		}
	}
	
	public void cambioDeMedio(){
	if(z==0)
		if(estaEnElAgua())
			medio=false;
			else
				medio=true;
	}

}