import java.util.Scanner;

public class Uri1154 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int N, contador = 0, soma = 0;
		
		while ( true ) {
			N = teclado.nextInt();
			if ( N < 0 ) { break; }
			contador++;
			soma += N;
		}
		
		System.out.printf( "%.2f\n", ( (double) soma / (double) contador ) );

		teclado.close();
	}
}