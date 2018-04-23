public class Pila extends Lista{

	public Pila(){
		super();
	}
	
	public void pop(){
		extraeUltimo();
	}

	public void push(Object ob){
		ponUltimo(ob);
	}

	public boolean vacia(){
		return estaVacia();
	}

	public Object cima(){
		return lastElement();
	}
}
