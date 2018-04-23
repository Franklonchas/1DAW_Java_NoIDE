public class Lista{
	public static void main(String[] args){
		int v[]=new int[10];
		rellenar(v);
		ordenar(v);
		visualizar(v);
	}
	public static void rellenar(int v[]){
		for (int i=0; i<v.length; i++){
			v[i]=(int)(Math.random()*100+1);
		}
	}

	public static void ordenar(int v[]){
		for(int i=1;i<10;i++){
			for (int j=0; j<v.length-1; j++){
				if (v[j]>v[j+1]){
					int aux=v[j];
					v[j]=v[j+1];
					v[j+1]=aux;
				}
			}
		}
	}

	public static void visualizar(int v[]){
		for (int i=0; i<v.length; i++){
			System.out.println(v[i]);
		}
	}

	}
