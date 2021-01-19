import java.util.Scanner;

public class Uri1564 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		String entrada;
		int reclamacoes;
		StringBuilder msgSaida = new StringBuilder("");
		
		while (true) {
			if ( teclado.hasNextLine() ){
				entrada = teclado.nextLine();
			}
			else { break; }
			
			if ( entrada.equals("")) { break; }
								
			reclamacoes = Integer.parseInt( entrada );
			
			if ( reclamacoes > 0 ) {
				msgSaida.append( "vai ter duas!\n" );
			}
			else {
				msgSaida.append( "vai ter copa!\n" );
			}
		}
		System.out.print( msgSaida.toString() );
		teclado.close();
	}
}