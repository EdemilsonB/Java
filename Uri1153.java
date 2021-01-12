import java.util.Scanner;

public class Uri1153 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int N, fatorial = 1;
		
		N = teclado.nextInt();
		
		for ( int i = 1; i <= N; i++ ) {
			fatorial *= i;
		}
		
		System.out.println( fatorial );

		teclado.close();
	}
}