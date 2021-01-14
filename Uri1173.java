import java.util.Scanner;

public class Uri1173 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int vetor[] = new int[10];
		
		vetor[0] = teclado.nextInt();
		
		for ( int i = 1; i < vetor.length; i++ ) {
			vetor[i] = vetor[i-1] * 2;
		}
		
		for ( int i =0; i < vetor.length; i++ ) {
			System.out.println( "N[" + i + "] = " + vetor[i] );
		}

		teclado.close();
	}
}