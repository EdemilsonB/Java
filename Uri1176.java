import java.util.Scanner;

public class Uri1176 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		String msgSaida = "";
		
		long vetor[] = new long[61];
		vetor[0] = 0;
		vetor[1] = 1;
		for ( int i = 2; i < vetor.length; i++ ) {
			vetor[i] = vetor[ i - 1] + vetor [ i - 2];
		}
		
		// 0 1 1 2 3 5 
		
		int entrada = teclado.nextInt(), caso;
		for ( int i = 1; i <= entrada; i++ ) {
			caso = teclado.nextInt();
			msgSaida += "Fib(" + caso + ") = " + vetor[caso] + "\n";
		}

		System.out.print( msgSaida );
		teclado.close();
	}
}