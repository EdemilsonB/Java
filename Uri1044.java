import java.util.Scanner;

public class Uri1044 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int A = teclado.nextInt();
		int B = teclado.nextInt();
		int menor, maior, resto;
		
		if ( A < B ) { menor = A ; maior = B; }
		else { menor = B ; maior = A; }
		
		resto = maior % menor ;
		if ( resto > 0 ) {
			System.out.println("Nao sao Multiplos");
		}
		else {
			System.out.println("Sao Multiplos");
		}
		
		teclado.close();
	}
}
