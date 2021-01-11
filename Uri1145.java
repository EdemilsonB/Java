import java.util.Scanner;

public class Uri1145 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int X, Y;
		StringBuilder msgSaida = new StringBuilder();

		X = teclado.nextInt();
		Y = teclado.nextInt();

		for ( int i = 1 ; i < Y ; i++ ) {
			if ( ( i % X ) == 0 ) {  msgSaida.append(i + "\n"); }
			else {  msgSaida.append(i + " ");}
		}
		msgSaida.append(Y);
		System.out.println( msgSaida.toString() );
		teclado.close();
	}
}