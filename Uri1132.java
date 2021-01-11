import java.util.Scanner;

public class Uri1132 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int X, Y, menor, maior, resto, soma = 0;
		
		X = teclado.nextInt();
		Y = teclado.nextInt();
		
		if ( X > Y ) { maior = X; menor = Y; }
		else { maior = Y; menor = X; }
		
		for ( int i = menor; i <= maior; i++ ) {
			resto = i % 13;
			if ( resto != 0 ) { soma += i; }
		}
		
		System.out.println( soma );
		teclado.close();		
	}
}
