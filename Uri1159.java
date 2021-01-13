import java.util.Scanner;

public class Uri1159 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int soma, N, X;
		String msgSaida = "";
		
		N = teclado.nextInt();
		for ( int i = 1; i <= N; i++ ) {
			X = teclado.nextInt();
			soma = 0;
			for ( int j = 1; j < X; j++ ) {
				if ( X % j == 0 ) { soma += j; } 
			}
			if ( soma == X ) { msgSaida += X + " eh perfeito\n"; }
			else { msgSaida += X + " nao eh perfeito\n"; }
		}
		System.out.print( msgSaida );

		teclado.close();
	}
}