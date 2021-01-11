
public class Uri1098 {
	public static void main(String[] args) {
		
		for ( float i = 0 ; i <= 2.001 ; i += 0.2 ) {
			for ( double j = 1 ; j <= 3 ; j++ ) {
				
				if ( i == 0  ||  i == 1  || i >= 2 ) {
					System.out.printf("I=%d J=%d\n",  (int)i, (int)j + (int)i);
				}
				else {
				
					System.out.printf( "I=%.1f J=%.1f\n", i, (j + i ));
				}
			}
		}
	}
}
