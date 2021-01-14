import java.util.Scanner;

public class Uri1177 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		StringBuilder msgSaida = new StringBuilder("");
		int vetor[] = new int[1000];
		int entrada = teclado.nextInt();
		int contador = 0;
		
		while ( contador < vetor.length ) {
			for ( int j = 0; j < entrada; j++ ) {
				if ( contador + j == vetor.length ) { break; }
				vetor [ contador + j ] = j;
				msgSaida.append( "N[" + (contador + j) + "] = " + j + "\n");
			}
			contador += entrada;
		}

		System.out.print( msgSaida );
		teclado.close();
	}
}