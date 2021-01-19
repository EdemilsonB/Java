import java.util.Scanner;

public class Uri1557 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int entrada, numero, qtdeDigitos;
		StringBuilder msgSaida = new StringBuilder("");
		
		while (true) {
			entrada = teclado.nextInt();
			if ( entrada == 0 ){ break; }
			else if ( entrada == 1 ) {
				msgSaida.append( "1\n\n" );
				continue;
			}
			
			int matriz[][] = new int[entrada][entrada];
			
			matriz[0][0] = 1;
			for ( int i = 1; i < entrada; i++ ) {
				matriz[i][0] = matriz[ i - 1 ][0] * 2;
			}
			for ( int i = 0; i < entrada; i++ ) {
				for ( int j = 1; j < entrada; j++ ) {
					matriz[i][j] = matriz[i][ j - 1 ] * 2;
				}
			}
			
			numero = matriz[entrada - 1][entrada - 1];
			for ( qtdeDigitos = 0; numero > 0; numero = numero / 10 ) { qtdeDigitos++; }
			
			for ( int i = 0; i < entrada; i++ ) {
				for ( int j = 0; j < entrada; j++ ) {
					if ( j == 0 ) {
						msgSaida.append( String.format("%" + qtdeDigitos + "d", matriz[i][j]));
					}
					else { 
						msgSaida.append( String.format(" %" + qtdeDigitos + "d", matriz[i][j]));
					}
				}
				msgSaida.append( "\n" );
			}
			msgSaida.append( "\n" );
		}
		System.out.print( msgSaida.toString() );
		teclado.close();
	}
}