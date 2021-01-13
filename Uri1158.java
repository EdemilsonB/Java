import java.util.Scanner;

public class Uri1158 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		String msgSaida = "";
		int soma;
		int N = teclado.nextInt();
		
		for ( int i = 1; i <= N; i++ ) {
			int X = teclado.nextInt();
			int Y = teclado.nextInt();
			soma = 0;
			if ( X % 2 == 0 ) { X++; }
			for ( int j = 1; j <= Y; j++ ) {
				soma += X;
				X += 2;
			}
			msgSaida += soma + "\n";
		}
		System.out.print( msgSaida );

		teclado.close();
	}
}