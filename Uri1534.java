import java.util.Scanner;

public class Uri1534 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		String entrada;
		int ordem = 0, loop = 0, primeiro = 0, ultimo = 0;
		StringBuilder msgSaida = new StringBuilder("");
		
		while (true) {
			if ( teclado.hasNextLine() ){
				entrada = teclado.nextLine();
			}
			else { break; }
			
			if ( entrada.equals("")) { break; }
								
			ordem = Integer.parseInt( entrada );
			int matriz[][] = new int[ordem][ordem];
			
			loop = (ordem /2)-1;
			
			primeiro = 0;
			ultimo = ordem - 1;
			
			for ( int i = 0; i <= loop; i++ ) {
				matriz[primeiro][primeiro] = 1;
				for ( int j = primeiro + 1; j < ultimo; j++ ) { matriz[primeiro][j] = 3; }
				matriz[primeiro][ultimo] = 2;
				for ( int j = primeiro + 1; j < ultimo; j++ ) { matriz[j][ultimo] = 3; }
				matriz[ultimo][ultimo] = 1;
				for ( int j = ultimo - 1; j > primeiro; j-- ) { matriz[ultimo][j] = 3; }
				matriz[ultimo][primeiro] = 2;
				for ( int j = ultimo - 1; j > primeiro; j-- ) { matriz[j][primeiro] = 3; }
				primeiro++;
				ultimo--;
			}
			
			if ( ordem % 2 == 0 ) {
				primeiro = ( ordem / 2 ) - 1;
				matriz[primeiro][primeiro] = 1;
				matriz[primeiro][primeiro+1] = 2;
				matriz[primeiro+1][primeiro+1] = 1;
				matriz[primeiro+1][primeiro] = 2;
			}
			else {
				ultimo = ( ordem / 2 );
				matriz[ultimo][ultimo] = 2;
			}
			
			for ( int i = 0; i < ordem; i++ ) {
				for ( int j = 0; j < ordem; j++ ) {
					msgSaida.append( matriz[i][j]);
				}
				msgSaida.append( "\n" );
			}
		}
		System.out.print( msgSaida.toString() );
		teclado.close();
	}
}