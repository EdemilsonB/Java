import java.util.Scanner;

public class Uri1052 {
    public static void main ( String args[] ) {

        Scanner teclado = new Scanner(System.in) ;
        int month ;

        // literais
        int JANUARY = 1, FEBRUARY = 2, MARCH = 3, APRIL = 4, MAY = 5, JUNE = 6, JULY = 7, AUGUST = 8, SEPTEMBER = 9, OCTOBER = 10, NOVEMBER = 11, DECEMBER = 12;
        
        month = teclado.nextInt() ;

        if ( month == JANUARY ) {
            System.out.println( "January" );
        }
        else if ( month == FEBRUARY ) {
            System.out.println( "February" );
        }
        else if ( month == MARCH ) {
            System.out.println( "March" );
        }
        else if ( month == APRIL ) {
            System.out.println( "April" );
        }
        else if ( month == MAY ) {
            System.out.println( "May" );
        }
        else if ( month == JUNE ) {
            System.out.println( "June" );
        }
        else if ( month == JULY ) {
            System.out.println( "July" );
        }
        else if ( month == AUGUST ) {
            System.out.println( "August" );
        }
        else if ( month == SEPTEMBER ) {
            System.out.println( "September" );
        }
        else if ( month == OCTOBER ) {
            System.out.println( "October" );
        }
        else if ( month == NOVEMBER ) {
            System.out.println( "November" );
        }
        else if ( month == DECEMBER ) {
            System.out.println( "December" );
        }
    }
}