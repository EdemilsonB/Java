import java.util.Scanner;

public class Uri1178 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		StringBuilder msgSaida = new StringBuilder("");
		double vetor[] = new double[100];
		double entrada = teclado.nextDouble();
		
		vetor[0] = entrada;
		for ( int i = 1; i < vetor.length; i++ ) {
			vetor[i] = vetor[ i - 1 ] / 2;
		}
		
		for ( int i = 0; i < vetor.length; i++ ) {
			msgSaida.append( String.format("N[%d] = %.4f\n", i, vetor[i] ) );
		}
		
		System.out.print( msgSaida );
		teclado.close();
	}
}