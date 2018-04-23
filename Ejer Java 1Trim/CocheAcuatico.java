public class CocheAcuatico extends Coche{
	protected int z;
	protected boolean estado;
	protected boolean medio;
	public CocheAcuatico(String modelo, String matricula, String color){
		super(modelo,matricula,color);
		z=0;
		estado=false;
		medio=false;
	}
	public boolean estaInmerso(){
		return estado;
	}
	public boolean estaEnElAgua(){
		return medio;
	}
	public void imprimeEstado(){
		super.imprimeEstado();
		System.out.println("Es un coche sumergible");
		if(estado)
			System.out.println("En el agua");
		else
			System.out.println("En tierra");
		System.out.println("z= "+z);
	}
}
