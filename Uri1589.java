import java.util.Scanner;

public class Uri1589 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int casos, r1, r2;
		StringBuilder msgSaida = new StringBuilder("");
		
		casos = teclado.nextInt();
		
		for ( int i = 1; i <= casos; i++ ) {
			r1 = teclado.nextInt();
			r2 = teclado.nextInt();
			msgSaida.append( ( r1 + r2 ) + "\n" );
		}
		System.out.print( msgSaida.toString() );
		teclado.close();
	}
}