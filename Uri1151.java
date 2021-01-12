import java.util.Scanner;

public class Uri1151 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int entrada = teclado.nextInt();
		int anterior = 0, atual = 1, proximo = 1, contador = 2;
		StringBuilder msgSaida = new StringBuilder("");
		
		if ( entrada == 1 ) {
			msgSaida.append( "0\n");
		}
		else {
			msgSaida.append( "0 ");
			while (true) {
				if ( contador == entrada ) { msgSaida.append( atual + "\n"); break; }
				else { msgSaida.append( atual + " ");}
				contador++;
				proximo = anterior + atual;
				anterior = atual;
				atual = proximo;
			}
		}
		System.out.print( msgSaida.toString() );
		teclado.close();
	}
}