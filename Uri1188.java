import java.util.Scanner;

public class Uri1188 {
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
		int coluna = 5;
		int qtdeCelulas = 0;
		
		for (int i = 7; i < 12; i++ ) {
			for (int j = coluna; j < ( 12 - coluna) ; j++ ) {
				soma += matriz[i][j];
				qtdeCelulas++;
			}
			coluna--;
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