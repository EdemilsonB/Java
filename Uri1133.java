import java.util.Scanner;

public class Uri1133 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int X, Y, menor, maior, resto;
		
		X = teclado.nextInt();
		Y = teclado.nextInt();
		
		if ( X >= Y ) { maior = X ; menor = Y; }
		else { maior = Y; menor = X; }
		
		for ( int i = ( menor + 1 ); i < maior; i++ ) {
			resto = i % 5;
			if ( resto == 2  ||  resto == 3 ) {
				System.out.println( i );
			}
		}
		teclado.close();		
	}
}
