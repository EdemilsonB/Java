import java.util.Scanner;

public class Uri1175 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int vetor[] = new int[20];
		int temp = 0;
				
		for ( int i = 0; i < vetor.length; i++ ) {
			vetor[i] = teclado.nextInt();
		}
		
		for ( int i = 0; i < (vetor.length / 2); i++ ) {
			temp = vetor[i];
			vetor[i] = vetor[ (vetor.length - 1 - i) ];
			vetor[ (vetor.length - 1 -i) ] = temp;
		}
		
		for ( int i = 0; i < vetor.length; i++ ) {
			System.out.println( "N[" + i + "] = " + vetor[i]);
		}
		teclado.close();
	}
}