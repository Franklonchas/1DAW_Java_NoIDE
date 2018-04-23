public class BomboCorregido {
    protected boolean bombo[];
    public BomboCorregido(int n){
        bombo = new boolean[n];
        for (int i=0;i<n ;i++ ){
            bombo[i]=true;
        }
    }
    public int totalBolas(){
        int total=0;
        for (int i=0;i<bombo.length;i++ )   {
            if(bombo[i]==true)
                total++;
        }
        return total;
    }
    public boolean quedanBolas(){
        if(totalBolas()>0)
            return true;
        return false;
    }
    public void meteBola(int bola){
        if(bola>=0 && bola<bombo.length)
            bombo[bola]=true;
        else
            System.out.println("No se pudo introducir la bola");
    }
    public int sacaBola(){
        int bola;
        if(quedanBolas()){
            do{
            bola= (int)(Math.random()*bombo.length);
            }while(!bombo[bola]);
            bombo[bola]=false;
            return bola;
        }else
            System.out.println("El bombo esta vacio");
            return -1;
    }
}