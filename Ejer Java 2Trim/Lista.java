/* Practica 2 -- Ejercicio1*/

import java.util.*;

public class Lista extends Vector{

	public Lista(){
		super();
	}

	public Lista(Object ob){
		super();
		addElement(ob);
	}

	public void ponPrimero(Object ob){
		insertElementAt(ob,0);
	}

	public void ponUltimo(Object ob){
		addElement(ob);
	}

	public boolean estaVacia(){
		return isEmpty();
	}

	public Object extraePrimero(){
		Object ob = firstElement();
		if (ob!=null){
			removeElementAt(0);
		}return ob;
	}

	public Object extraeUltimo(){
		Object ob =  firstElement();
		if (ob!=null){
			removeElementAt(size()-1);
		}return ob;
	}

	public void visualizaElementos(){
		for(Enumeration e = elements(); e.hasMoreElements();)	
			System.out.println(e.nextElement());
	}
}