public class Fatorial {
	public static void main(String [] args) {
		System.out.print(calularFatorial(5));
	}
	
	public static int calularFatorial(int n) {
		int resultado = 1;
		
		for (int i=2; i <=n; i++)
			resultado = i;
		return resultado;
	}
}