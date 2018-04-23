public class Carta{

private int palo;
private int numero;

public Carta(){
palo =(int) (Math.random()*4+1);
numero=(int) (Math.random()*10+1);
}

public Carta(int palo, int numero){
this.palo=palo;
this.numero=numero;
}

public void visualizarCarta(){
System.out.println("Palo==> 1 ESPADAS//2 BASTOS//3 OROS//4 COPAS");
System.out.println("El palo de esta clase es" + palo + " -- " + "Y su numero es " + numero);
}

public int valorarCarta(){
return numero;
}


}
