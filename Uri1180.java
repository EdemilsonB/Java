import java.util.Scanner;

public class Uri1180 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int menorValor, posicaoMenorValor = 0;
		
		int entrada = teclado.nextInt();
		int vetor[] = new int[entrada];
		
		for ( int i = 0; i < vetor.length; i++ ) {
			vetor[i] = teclado.nextInt();
		}
		
		menorValor = vetor[0];
		for ( int i = 0; i < vetor.length; i++ ) {
			if ( vetor[i] < menorValor ) {
				menorValor = vetor[i];
				posicaoMenorValor = i;
			}
		}

		System.out.println( "Menor valor: " + menorValor );
		System.out.println( "Posicao: " + posicaoMenorValor );
		teclado.close();
	}
}