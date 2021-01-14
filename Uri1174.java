import java.util.Scanner;

public class Uri1174 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		double vetor[] = new double[100];
				
		for ( int i = 0; i < vetor.length; i++ ) {
			vetor[i] = teclado.nextDouble();
		}
		
		for ( int i = 0; i < vetor.length; i++ ) {
			if ( vetor[i] <= 10.0f ) {
				System.out.printf( "A[" + i + "] = %.1f\n", vetor[i] );
			}
		}

		teclado.close();
	}
}