import java.util.Scanner;

public class Uri1155 {
	public static void main(String args[]) {

		double S = 0.0f;
		for ( int i = 1; i <= 100; i++ ) {
			S += ( 1.0f / i );
		}
		System.out.printf( "%.2f\n", S );
	}
}