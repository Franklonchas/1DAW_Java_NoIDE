public class Coche extends Vehiculo{

protected String marca, matricula, color;

public Coche(String marca, String matricula, String color){
	super();
	this.marca=marca;
	this.matricula=matricula;
	this.color=color;
	}

public String getMarca(){
	return marca;
	}

public String getMatricula(){
	return matricula;
	}

public String getColor(){
	return color;
	}

public void imprimeEstado(){
	super.imprimeEstado();
	System.out.println("Marca= " + marca);
	System.out.println("Matricula= " + matricula);
	System.out.println("Color= " + color);
	}




}
