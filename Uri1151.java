import java.util.Scanner;

public class Uri1151 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int entrada = teclado.nextInt();
		
		if ( entrada <= 1 ) {
			System.out.println( "0 1");
		}
		else {
			int anterior = 1, atual = 1, proximo = 1;
			StringBuilder msgSaida = new StringBuilder("0 1 ");
			
			while (true) {
				proximo = anterior + atual;
				if ( proximo >= entrada ) { msgSaida.append( atual + "\n"); break; }
				else { msgSaida.append( atual + " "); }
				
				anterior = atual;
				atual = proximo;
				
			}

			System.out.print( msgSaida.toString() );
		}
		teclado.close();
	}
}