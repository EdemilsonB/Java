import java.util.Scanner;

public class Uri1827 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int ordem, inicioUm;
		StringBuilder msgSaida = new StringBuilder("");

		while (teclado.hasNext()) {
			ordem = teclado.nextInt();
			int matriz[][] = new int[ordem][ordem];
			inicioUm = ordem / 3;
			
			for ( int i = 0; i < ordem; i++ ) {
				matriz[i][i] = 2;
				matriz[i][ordem - 1 - i] = 3;
			}
			for ( int i = inicioUm; i < ordem - inicioUm; i++  ) {
				for ( int j = inicioUm; j < ordem - inicioUm; j++ ) {
					matriz[i][j] = 1;
				}
			}
			matriz[ordem / 2][ordem / 2] = 4;
			
			for ( int i = 0; i < ordem; i++ ) {
				for ( int j = 0; j < ordem; j++ ) {
					msgSaida.append( matriz[i][j] );
				}
				msgSaida.append("\n");
			}
			msgSaida.append("\n");
		}
		System.out.print( msgSaida.toString() );
		teclado.close();
	}
}