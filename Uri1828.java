import java.util.Scanner;

public class Uri1828 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int casos;
		String escolhaSheldon, escolhaRaj;
		StringBuilder msgSaida = new StringBuilder("");

		casos = Integer.parseInt( teclado.nextLine() );
		
		for ( int i = 1; i <= casos; i++ ) {
			escolhaSheldon = teclado.next();
			escolhaRaj = teclado.next();
			
			if ( escolhaSheldon.equals(escolhaRaj) ) { msgSaida.append( "Caso #" + i + ": De novo!\n" ); }
			else if ( escolhaSheldon.equals("tesoura") && escolhaRaj.equals("papel") ) { msgSaida.append( "Caso #" + i + ": Bazinga!\n" ); }
			else if ( escolhaSheldon.equals("papel") && escolhaRaj.equals("pedra") ) { msgSaida.append( "Caso #" + i + ": Bazinga!\n" ); }
			else if ( escolhaSheldon.equals("pedra") && escolhaRaj.equals("lagarto") ) { msgSaida.append( "Caso #" + i + ": Bazinga!\n" ); }
			else if ( escolhaSheldon.equals("lagarto") && escolhaRaj.equals("Spock") ) { msgSaida.append( "Caso #" + i + ": Bazinga!\n" ); }
			else if ( escolhaSheldon.equals("Spock") && escolhaRaj.equals("tesoura") ) { msgSaida.append( "Caso #" + i + ": Bazinga!\n" ); }
			else if ( escolhaSheldon.equals("tesoura") && escolhaRaj.equals("lagarto") ) { msgSaida.append( "Caso #" + i + ": Bazinga!\n" ); }
			else if ( escolhaSheldon.equals("lagarto") && escolhaRaj.equals("papel") ) { msgSaida.append( "Caso #" + i + ": Bazinga!\n" ); }
			else if ( escolhaSheldon.equals("papel") && escolhaRaj.equals("Spock") ) { msgSaida.append( "Caso #" + i + ": Bazinga!\n" ); }
			else if ( escolhaSheldon.equals("Spock") && escolhaRaj.equals("pedra") ) { msgSaida.append( "Caso #" + i + ": Bazinga!\n" ); }
			else if ( escolhaSheldon.equals("pedra") && escolhaRaj.equals("tesoura") ) { msgSaida.append( "Caso #" + i + ": Bazinga!\n" ); }
			else { msgSaida.append( "Caso #" + i + ": Raj trapaceou!\n" ); }
		}
		System.out.print( msgSaida.toString() );
		teclado.close();
	}
}