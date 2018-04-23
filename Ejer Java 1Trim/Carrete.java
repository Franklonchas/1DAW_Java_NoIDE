public class Carrete {
    private int capacidad, fotosRealizadas, fotosValidas,fotosVeladas;
    public Carrete(int capacidad){
        if(capacidad==12 || capacidad==24|| capacidad==36)
            this.capacidad = capacidad;    
        else
            this.capacidad=12;
            fotosRealizadas=0;
            fotosValidas=0;
            fotosVeladas=0;
    }
    public Carrete(){
        this(12);
    }
    public void nueva(){
        if(fotosRealizadas<capacidad) //es lo mismo que poner: if(sePuedeHacer())
            fotosRealizadas++;
        else
            System.out.println("El carrete esta lleno");
    }
    public boolean sePuedeHacer(){
        if(fotosRealizadas<capacidad)
            return true;
        return false;
    }
    public boolean estaLleno(){
        if(capacidad==fotosRealizadas)
            return true;
        return false;
    }
    public int numeroFotos(){
        return fotosRealizadas;
    }
    public int fotosValidas(){
        return fotosValidas;
    }
    public int fotosVeladas(){
        return fotosVeladas;
    }
    public int revelar(){
    fotosValidas=0;
    fotosVeladas=0;
    for(int i=1;i<=fotosRealizadas;i++){
		if((int)(Math.random()*100+1)<=98)
                fotosValidas++;
            else
                fotosVeladas++;
        }
        return fotosValidas;
    }
}