import java.util.Scanner;

public class Uri1189 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		String operacao = teclado.nextLine();
		
		double matriz[][] = new double[12][12];
		for ( int i = 0; i < 12; i++ ) {
			for ( int j = 0; j < 12; j++ ) {
				matriz[i][j] = Double.parseDouble( teclado.nextLine() );
			}
		}
		
		double soma = 0;
		int linha = 1;
		int qtdeCelulas = 0;
		
		for (int j = 0; j < 5; j++ ) {
			for (int i = linha; i < ( 12 - linha ); i++ ) {
				soma += matriz[i][j];
				qtdeCelulas++;
			}
			linha++;
		}
		
		if ( operacao.equals("S") ) {
			System.out.printf( "%.1f\n", soma );
		}
		else {
			System.out.printf( "%.1f\n", soma / qtdeCelulas );
		}
		teclado.close();
	}
}