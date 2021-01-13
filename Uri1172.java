import java.util.Scanner;

public class Uri1172 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int vetor[] = new int[10];
		
		for ( int i = 0; i < vetor.length; i++ ) {
			vetor[i] = teclado.nextInt();
			if ( vetor[i] <= 0 ) { vetor[i] = 1; }
		}
		
		for ( int i =0; i < vetor.length; i++ ) {
			System.out.println( "X[" + i + "] = " + vetor[i] );
		}

		teclado.close();
	}
}