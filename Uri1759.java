import java.util.Scanner;

public class Uri1759 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int qtdeHos;
		StringBuilder msgSaida = new StringBuilder("");
		
		qtdeHos = teclado.nextInt();
		
		msgSaida.append( "Ho" );
		for ( int i = 2; i <= qtdeHos; i++ ) {
			msgSaida.append( " Ho" );
		}
		msgSaida.append( "!\n" );
		System.out.print( msgSaida.toString() );
		teclado.close();
	}
}