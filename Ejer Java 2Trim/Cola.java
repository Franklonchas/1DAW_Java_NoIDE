public class Cola extends Lista{
	
	public Cola(){
		super();
	}

	public void extraeDeCola(){
		extraePrimero();
	}

	public void ponEnCola(Object ob){
		ponUltimo(ob);
	}

	public boolean vacia(){
		return estaVacia();
	}

	public Object frente(){
		return firstElement();
	}
}
