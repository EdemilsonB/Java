import java.util.Scanner;

public class Uri1182 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int coluna = Integer.parseInt( teclado.nextLine() );
		String operacao = teclado.nextLine();
		
		double matriz[][] = new double[12][12];
		for ( int i = 0; i < 12; i++ ) {
			for ( int j = 0; j < 12; j++ ) {
				matriz[i][j] = Double.parseDouble( teclado.nextLine() );
			}
		}
		
		double soma = 0;
		for (int i = 0; i < 12; i++ ) {
			soma += matriz[i][coluna];
		}
		
		if ( operacao == "S" ) {
			System.out.printf( "%.1f\n", soma );
		}
		else {
			System.out.printf( "%.1f\n", soma / 12 );
		}
		teclado.close();
	}
}