import java.util.Scanner;

public class Uri1146 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int X;
		StringBuilder msgSaida = new StringBuilder();

		while (true) {
			X = teclado.nextInt();
			if ( X == 0 ) { break; }
			
			for ( int i = 1; i <= X; i++ ) {
				if ( i < X ) { msgSaida.append( i + " " ); }
				else { msgSaida.append( i + "\n"); }
			}
		}
		System.out.print( msgSaida.toString() );
		teclado.close();
	}
}