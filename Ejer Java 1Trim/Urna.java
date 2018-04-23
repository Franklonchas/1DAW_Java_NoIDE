public class Urna{

protected int bolasBlancas;
protected int bolasNegras;

public Urna(){
	this.bolasBlancas=20;
	this.bolasNegras=20;
}
/*0=blanca, 1=negra*/

public Urna(int bolasBlancas, int bolasNegras){
this.bolasBlancas=bolasBlancas;
this.bolasNegras=bolasNegras;
}

public int sacaBola(){
int bolaAleatoria = (int)(Math.random()*(this.bolasBlancas+this.bolasNegras)+1);
System.out.println(bolaAleatoria);
	if (bolaAleatoria<=bolasBlancas){
	this.bolasBlancas-=1;
	return 0;
	}else{
		this.bolasNegras-=1;
		return 1;
	}
}

public void meteBola(int colorBola){
if (colorBola==0)
	bolasBlancas+=1;
	else
		bolasNegras+=1;
}

public boolean quedanBolas(){
if(bolasBlancas+bolasNegras!=0)
	return true;
	else
		return false;
}

public boolean quedaMasDeUnaBola(){
if(bolasBlancas+bolasNegras>1)
	return true;
	else
		return false;
}

public int totalBolas(){
int nBolas=bolasBlancas+bolasNegras;
return  nBolas; 
}

}