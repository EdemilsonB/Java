import java.util.Scanner;

public class Uri 1789 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		String entrada;
		int qtdeLesmas, velocidade;
		boolean n2, n3;
		StringBuilder msgSaida = new StringBuilder("");
		
		while (teclado.hasNext()) {
			qtdeLesmas = teclado.nextInt();
			
			n2 = n3 = false;
			for ( int i = 0; i < qtdeLesmas; i++ ) {
				velocidade = teclado.nextInt();
				if ( velocidade >= 20 ) { n3 = true; }
				else if ( velocidade >= 10 ) { n2 = true; }
			}
			if ( n3 ) { msgSaida.append( "3\n" ); }
			else if ( n2 ) { msgSaida.append( "2\n" ); }
			else { msgSaida.append( "1\n" ); }
		}
		System.out.print( msgSaida.toString() );
		teclado.close();
	}
}