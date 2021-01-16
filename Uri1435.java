import java.util.Scanner;

public class Uri1435 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int ordem = 0;
		int valorX = 0, valorY = 0, menorValor = 0;
		int valorInicioAteI, valorInicioAteJ, valorFimAteI, valorFimAteJ;
		StringBuilder msgSaida = new StringBuilder("");
		
		while (true) {
			ordem = Integer.parseInt( teclado.nextLine() );
			if ( ordem == 0 ) { break; }
			if ( ordem == 1 ) { msgSaida.append( String.format("%3d\n\n", 1) ); continue; }
			
			int matriz[][] = new int[ordem][ordem];
			
			for ( int i = 0; i < ordem; i++ ) {
				for ( int j = 0; j < ordem; j++ ) {
					valorInicioAteI = i + 1;
					valorFimAteI = ordem - i;
					valorInicioAteJ = j + 1;
					valorFimAteJ = ordem - j;
					
					if ( valorInicioAteI <= valorFimAteI ) { valorX = valorInicioAteI; }
					else { valorX = valorFimAteI; }
					
					if ( valorInicioAteJ <= valorFimAteJ ) { valorY = valorInicioAteJ; }
					else { valorY = valorFimAteJ; }
					
					if ( valorX <= valorY ) { menorValor = valorX; }
					else { menorValor = valorY; }
					
					matriz[i][j] = menorValor;	
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