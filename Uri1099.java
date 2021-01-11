import java.util.Scanner;

public class Uri1099 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int qtdeCasos = teclado.nextInt();
		String msgSaida = "";
		int x, y, p, s, soma;
		
		for ( int i = 1 ; i <= qtdeCasos ; i++ ) {
			x = teclado.nextInt();
			y = teclado.nextInt();
			
			if ( x <= y ) { p = x ; s = y; }
			else { p = y ; s = x; }
			
			if ( p % 2 == 0 ) { p++; }
			else { p += 2; }
			
			soma = 0;
			for ( int j = p ; j < s ; j += 2 ) {
				soma += j; 
			}
			
			msgSaida += soma + "\n";
		}
		System.out.print(msgSaida);
		teclado.close();		
	}
}
