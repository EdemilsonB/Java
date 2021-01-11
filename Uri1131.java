import java.util.Scanner;

public class Uri1131 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int resultadoInter = 0, resultadoGremio = 0, nroConfrontos = 0, vitoriasInter = 0, vitoriasGremio = 0, empates = 0;
		int opcao = 1;
		String msgSaida = "";
		
		while ( opcao == 1 ) {
			resultadoInter = teclado.nextInt();
			resultadoGremio = teclado.nextInt();
			
			nroConfrontos++;
			if ( resultadoInter == resultadoGremio ) { empates++; }
			else if ( resultadoInter > resultadoGremio ) { vitoriasInter++; }
			else { vitoriasGremio++; }
			
			msgSaida += "Novo grenal (1-sim 2-nao)\n";
			opcao = teclado.nextInt();
		}
		
		System.out.print( msgSaida );
		System.out.printf( "%d grenais\n" , nroConfrontos );
		System.out.println( "Inter:" + vitoriasInter );
		System.out.println( "Gremio:" + vitoriasGremio );
		System.out.println( "Empates:" + empates );
		
		if ( vitoriasInter == vitoriasGremio ) { System.out.println( "Nao houve vencedor" ); }
		else if ( vitoriasInter > vitoriasGremio ) { System.out.println( "Inter venceu mais" ); }
		else { System.out.println( "Gremio venceu mais" ); }
		
		teclado.close();		
	}
}
