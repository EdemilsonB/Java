public class Continhas {

    public static void main ( String args[] ) {

        int a, b, c;
        a = 19;
        b = 3;
        c = a + b;

        System.out.println( "Valor do a = " + a );
        System.out.println( "Valor do b = " + b );
        System.out.println( "Valor da soma = " + c );

        c = a - b;
        System.out.println( "Valor da subtracao = " + c );

        c = a * b;
        System.out.println( "Valor da multiplicacao = " + c );

        c = a / b;
        System.out.println( "Valor da divisao = " + c );

        c = a % b;
        System.out.println( "Valor do resto = " + c );

        double x;
        x = 1.0 / 2;
        System.out.println( "Valor do x (double) = " + x );

        float y;
        y = 1.0f / 2;
        System.out.println( "Valor do y (float) = " + y);
    }

}