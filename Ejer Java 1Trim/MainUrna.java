public class MainUrna{

public static void main(String[] args) {
Urna EstaUrna = new Urna(11,40);
while (EstaUrna.quedaMasDeUnaBola()){
int bola1=EstaUrna.sacaBola();
int bola2=EstaUrna.sacaBola();
if (bola1==bola2)
	EstaUrna.meteBola(1);
	else
		EstaUrna.meteBola(0);
}
System.out.println(EstaUrna.sacaBola());
}

}