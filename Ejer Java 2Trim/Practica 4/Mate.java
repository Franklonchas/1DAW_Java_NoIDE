public class Mate{
	public static int sumaDivisores(int n){
		int suma = 0;
		for(int i = 1; i <= n/2; i++){
			if (n%i == 0)
				suma += i;
		}
		return suma;
	}

	public static int elMenor(int n, int m){
		if (n<m)
			return n;
		return m;
	}

	public static int elMayor(int n, int m){
		if (n>m)
			return n;
		return m;
	}

	public static int factorial(int n){
		int fac = 1;

		if (n < 0)
			return -1;
		for(int i = 1; i<= n; i++)
			fac *= i;
		return fac;
	}

	public static boolean primo(int n){
		int i = 2;
		while (i <= n/2){
			if(n%i == 0)
				return false;
			i++;
		}	
		return true;
	}

	public static boolean amigos(int n, int m){
		if(sumaDivisores(n) == m && sumaDivisores(m) == n)
			return true;
		return false;
	}

	public static boolean primos(int n, int m){
		int a = elMenor(n, m);
		int b = elMayor(n, m);
		for (int i = 2; i <= a/2; i++ ){
			if(a % i == 0 && b % i == 0)
				return false;
		}
		return true;
	}

	public static int potencia(int n, int m){
		int pot = 1;
		for (int i = 1;i <= m ; i++ )
			pot *= n;
		return pot;
	}

	public static int euler(int a){
		int contador = 0;
		for (int i = a-1; i >= 1 ; i-- ){
			if(primos(a,i))
				contador++;
		}
		return contador;
	}
}