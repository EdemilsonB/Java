import java.util.Scanner;

public class Uri1118 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		float entradaNota, notaA, notaB;
		String msgSaida = "";
		int opcao = 1;
		
		do {
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
			
			do {
				msgSaida += "novo calculo (1-sim 2-nao)\n";
				opcao = teclado.nextInt();
			} while ( opcao != 1  &&  opcao != 2 );
		}
		while ( opcao == 1 );
		
		System.out.print( msgSaida );
		teclado.close();		
	}
}
