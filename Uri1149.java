import java.util.Scanner;

public class Uri1149 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int A, N, soma;
		
		A = teclado.nextInt();
		do {
			N = teclado.nextInt();
		} while ( N <= 0 );
		
		soma = A;
		for ( int i = 1; i <= (N-1); i++ ) {
			soma += A + i;
		}
		
		System.out.println( soma );

		teclado.close();
	}
}