import java.util.Scanner;

public class Uri1116 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int qtdeCasos, X, Y;
		String msgSaida = "";
		
		qtdeCasos = teclado.nextInt();
		
		for ( int i = 1; i <= qtdeCasos; i++ ) {
			X = teclado.nextInt();
			Y = teclado.nextInt();
			
			if ( Y == 0 ) {
				msgSaida += "divisao impossivel\n";
			}
			else {
				msgSaida += String.format( "%.1f\n", (float)X / (float)Y );
			}
		}
		System.out.print( msgSaida );
		teclado.close();		
	}
}
