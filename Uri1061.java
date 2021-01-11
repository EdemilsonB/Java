import java.util.Scanner;

public class Uri1061 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		String entradaDiaI = teclado.nextLine();
		String entradaHoraI = teclado.nextLine();
		String entradaDiaF = teclado.nextLine();
		String entradaHoraF = teclado.nextLine();
		
		int diaI = Integer.parseInt(entradaDiaI.substring(4));
		int horaI = Integer.parseInt(entradaHoraI.substring(0,2));
		int minI = Integer.parseInt(entradaHoraI.substring(5,7));
		int segI = Integer.parseInt(entradaHoraI.substring(10,12));
		
		int diaF = Integer.parseInt(entradaDiaF.substring(4));
		int horaF = Integer.parseInt(entradaHoraF.substring(0,2));
		int minF = Integer.parseInt(entradaHoraF.substring(5,7));
		int segF = Integer.parseInt(entradaHoraF.substring(10,12));

		// tempos em segundos
		int segNoDia, segNaHora, segNoMin, tempoI, tempoF;
		segNoDia = ( 24 * 60 * 60 );
		segNaHora = ( 60 * 60 );
		segNoMin = 60;
		tempoI = ( diaI * segNoDia ) + ( horaI * segNaHora ) + ( minI * segNoMin ) + segI;
		tempoF = ( diaF * segNoDia ) + ( horaF * segNaHora ) + ( minF * segNoMin ) + segF;
		
		// duracao
		int tempoD, diaD, horaD, minD, segD;
		tempoD = tempoF - tempoI;
		diaD = tempoD / segNoDia ;
		tempoD -= ( segNoDia * diaD ) ;
		horaD = tempoD / segNaHora;
		tempoD -= (horaD * segNaHora );
		minD = tempoD / segNoMin;
		segD = tempoD % segNoMin;
		
		// saida
		System.out.println( diaD + " dia(s)" );
		System.out.println( horaD + " hora(s)" );
		System.out.println( minD + " minuto(s)" );
		System.out.println( segD + " segundo(s)" );
		
		teclado.close();
	}
}
