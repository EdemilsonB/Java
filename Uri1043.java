import java.util.Scanner;

public class Uri1043 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float A = teclado.nextFloat();
		float B = teclado.nextFloat();
		float C = teclado.nextFloat();
		
		// As medidas dadas formam um triangulo?
		boolean triangulo = false;
		if ( Math.abs((double)( B - C )) < A   &&   A < ( B + C )  ) { triangulo = true; }
		if ( Math.abs((double)( A - C )) < B   &&   B < ( A + C )  ) { triangulo = true; }
		if ( Math.abs((double)( A - B )) < C   &&   C < ( A + B )  ) { triangulo = true; }
		
		if ( triangulo ) {
			System.out.printf("Perimetro = %.1f\n", ( A + B + C));
		}
		else {
			System.out.printf("Area = %.1f\n", ( ( A + B ) * C ) / 2 );
		}
		
		teclado.close();
	}
}
