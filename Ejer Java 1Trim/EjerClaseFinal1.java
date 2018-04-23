public class MainVector{
	public static void main(String[] args){
		int[]v = new int[10];
		rellenarVector(v);
		ordenar(v);
		visualizarVector(v);
	}

	public static void rellenarVector(intv[]){
		for(int i=0; i<v.length; i++){
			v[i] = (int) (Math.random()*100+1);
		}
	}

	public static void rotarDerecha(int v[], int pos[]){
		int aux[] = new int[v.length];
		int j=0;
		for(int i=0; i<v.length;i++){
			j = i+pos;
			if(j>=v.length)
				j=j-v.length;
		}
		for (int=0;i<v.length ;i++ ){
			v[i]=aux[i];
		}
	}

public static void rotarIzquierda(int v[], int pos[]){
		int aux[] = new int[v.length];
		int j=0;
		for(int i=v.length-1; i>=0;i--){
			j = i-pos;
			if(j<0)
				j+=v.length;
				aux[j] = v[i];
		}
		for (int=0;i<v.length ;i++ ){
			v[i]=aux[i];
		}
	}

}
