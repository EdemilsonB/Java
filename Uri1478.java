import java.util.Scanner;

public class Uri1478 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int ordem = 0;
		int valor;
		StringBuilder msgSaida = new StringBuilder("");
		
		while (true) {
			ordem = Integer.parseInt( teclado.nextLine() );
			if ( ordem == 0 ) { break; }
			if ( ordem == 1 ) { msgSaida.append( String.format("%3d\n\n", 1) ); continue; }
			
			int matriz[][] = new int[ordem][ordem];
			
			for ( int i = 0; i < ordem; i++ ) {
				valor = 1;
				for ( int j = i; j < ordem; j++ ) {
					matriz[i][j] = valor;
					valor++;
				}
				valor = 1;
				for ( int j = i; j < ordem; j++ ) {
					matriz[j][i] = valor;
					valor++;
				}
			}
			
			for ( int i = 0; i < ordem; i++ ) {
				for ( int j = 0; j < ordem; j++ ) {
					if      ( j ==          0   ) { msgSaida.append( String.format("%3d", matriz[i][j]) ); }
					else if ( j <  ( ordem -1 ) ) { msgSaida.append( String.format(" %3d", matriz[i][j]) );  }
					else if ( j == ( ordem -1 ) ) { msgSaida.append( String.format(" %3d\n", matriz[i][j]) ); }
				}
				if ( i == (ordem -1 ) ) { msgSaida.append( "\n" ); }
			}
		}
		System.out.print( msgSaida.toString() );
		teclado.close();
	}
}