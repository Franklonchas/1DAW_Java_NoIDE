class UrnaTrampa extends Urna {
    public UrnaTrampa(int bolasNegras, int bolasBlancas){
        super(bolasNegras,bolasBlancas);
    }

public UrnaTrampa(){
this(20,20);}


public int sacaBola(){
if(quedanBolas()){
	if((int) (Math.random()*(bolasBlancas+bolasNegras)+1)<=bolasNegras){
		bolasNegras--;
	if(bolasBlancas > 0 && bolasNegras > 0){
		if(Math.random()*1000+1 < 2){
			if(Math.random()*2+1 == 1){
				bolasBlancas--;
				bolasNegras++;
			} else{
				bolasBlancas++;
				bolasNegras--;
			}
		}
	}
	return 0;
}
System.out.println("Se ha eliminado una bola del color blanco");
bolasBlancas--;
	if(bolasBlancas > 0 && bolasNegras > 0){
		if(Math.random()*1000+1 < 2){
			if(Math.random()*2+1 == 1){
				bolasBlancas--;
				bolasNegras++;
				}else{
					bolasBlancas++;
					bolasNegras--;
				}
			}
		}
			return 1;
	}
return -1;
}
}