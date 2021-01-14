import java.util.Scanner;

public class Uri1181 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		
		int linha = teclado.nextInt();
		String operacao = teclado.nextLine();
		
		// residuo teclado !!!
		
		
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