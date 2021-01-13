import java.util.Scanner;

public class Uri1156 {
	public static void main(String args[]) {

		double S = 0.0f;
		int j = 1;
		for ( int i = 1; i <= 39; i += 2 ) {
			S += ( (double) i / (double) j );
			j *= 2;
		}
		System.out.printf( "%.2f\n", S );
	}
}