import java.util.Scanner;

public class Uri1179 {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		StringBuilder msgSaida = new StringBuilder("");
		int vetorPar[] = new int[5];
		int vetorImpar[] = new int[5];
		int entrada, iPar = 0, iFinalPar = 4, iImpar = 0, iFinalImpar = 4;
		boolean parUsado = false, imparUsado = false;

		for (int i = 1; i <= 15; i++ ) {
			entrada = teclado.nextInt();
			
			if ( entrada % 2 == 0 ) {
				vetorPar [iPar] = entrada;
				iFinalPar = iPar;
				parUsado = true;
				iPar++;
			}
			else {
				vetorImpar [iImpar] = entrada;
				iFinalImpar = iImpar;
				imparUsado = true;
				iImpar++;
			}
			if ( iPar == vetorPar.length ) {
				for (int j = 0; j < vetorPar.length; j++ ) {
					msgSaida.append( "par[" + j + "] = " + vetorPar[j] + "\n" );
				}
				iPar = 0;
			}
			if ( iImpar == vetorImpar.length ) {
				for (int j = 0; j < vetorImpar.length; j++ ) {
					msgSaida.append( "impar[" + j + "] = " + vetorImpar[j] + "\n" );
				}
				iImpar = 0;
			}
		}
		if ( imparUsado && iFinalImpar != ( vetorImpar.length - 1 ) ) {
			for (int i = 0; i <= iFinalImpar; i++ ) {
				msgSaida.append( "impar[" + i + "] = " + vetorImpar[i] + "\n" );
			}
		}
		if ( parUsado && iFinalPar != ( vetorPar.length - 1 ) ) {
			for (int i = 0; i <= iFinalPar; i++ ) {
				msgSaida.append( "par[" + i + "] = " + vetorPar[i] + "\n" );
			}
		}
		
		System.out.print( msgSaida.toString() );
		teclado.close();
	}
}