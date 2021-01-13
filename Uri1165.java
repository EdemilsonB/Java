import java.util.Scanner;

public class Uri1165 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int N, X, j;
		boolean naoEhPrimo = false;
		String msgSaida = "";
		
		N = teclado.nextInt();
		
		for ( int i = 1; i <= N; i++ ) {
			X = teclado.nextInt();
		
			naoEhPrimo = false;
			j = 2;
			while ( j < X ) {
				if ( X % j == 0 ) { naoEhPrimo = true; break; }
				j++;
			}
			if ( naoEhPrimo ) { msgSaida += ( X + " nao eh primo\n" ); }
			else { msgSaida += ( X + " eh primo\n"); }
		}
		System.out.print( msgSaida );

		teclado.close();
	}
}