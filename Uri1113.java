import java.util.Scanner;

public class Uri1113 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int X, Y;
		String msgSaida = "";
		
		X = teclado.nextInt();
		Y = teclado.nextInt();
		
		while ( X != Y ) {
			
			if ( X > Y ) { msgSaida += "Decrescente\n"; }
			else { msgSaida += "Crescente\n"; }
						
			X = teclado.nextInt();
			Y = teclado.nextInt();
		}
		System.out.print( msgSaida );
		teclado.close();		
	}
}
