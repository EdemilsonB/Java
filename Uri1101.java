import java.util.Scanner;

public class Uri1101 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int M, N, p, s, soma;
		String msgSaida = "";
		
		M = teclado.nextInt();
		N = teclado.nextInt();
		
		while ( M > 0  &&  N > 0 ) {
			
			if ( M <= N ) { p = M ; s = N; }
			else { p = N ; s = M; }
			
			soma = 0;
			for ( int i = p ; i <= s ; i++ ) {
				msgSaida += ( i + " " );
				soma += i;
			}
			msgSaida += ( "Sum=" + soma + "\n" );
						
			M = teclado.nextInt();
			N = teclado.nextInt();
		}
		System.out.print(msgSaida);
		teclado.close();		
	}
}
