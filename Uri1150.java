import java.util.Scanner;

public class Uri1150 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int X, Z, soma= 0, qtdeNros = 1;
		
		X = teclado.nextInt();
		do {
			Z = teclado.nextInt();
		} while ( Z <= X );
		
		while (true) {
			if ( ( X + soma ) > Z ) { break; }
			soma += ( X + qtdeNros );
			qtdeNros++;
		}
		
		System.out.println(qtdeNros);

		teclado.close();
	}
}