import java.util.Scanner;

public class Uri1117 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		float entradaNota, notaA, notaB;
		String msgSaida = "";
		
		while (true) {
			entradaNota = teclado.nextFloat();
			if ( entradaNota >= 0f  &&  entradaNota <= 10f ) {
				notaA = entradaNota;
				break;
			}
			else {
				msgSaida += "nota invalida\n";
			}
		}
		while (true) {
			entradaNota = teclado.nextFloat();
			if ( entradaNota >= 0f  &&  entradaNota <= 10f ) {
				notaB = entradaNota;
				break;
			}
			else {
				msgSaida += "nota invalida\n";
			}
		}
		msgSaida += String.format( "media = %.2f\n", ( notaA + notaB ) / 2 );
		System.out.print( msgSaida );
		teclado.close();		
	}
}
