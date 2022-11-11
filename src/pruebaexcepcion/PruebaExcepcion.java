package pruebaexcepcion;

/**
 *
 * @author Dirley Diaz
 */
public class PruebaExcepcion {

    public static void main(String args[]) {
        formatoNumero();
        desborde();
        aritmetico();
    }

    //excepción tratada
    public static void formatoNumero() {

        int numero;
        String cadena = "  1";
        try {
            numero = Integer.parseInt(cadena);
        } catch (NumberFormatException ex) {
            System.out.println("No es un número, es una cadena de texto." + ex.getMessage());

        }
    }

    public static void desborde() {

        int v[] = new int[3];
        try {
            for (int i = 0; i < 5; i++) {
                v[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("el tipo de índice erróneo, de datos en un arreglo." + ex.getMessage());

        }
    }

    public static void aritmetico() {

        int numero = 5, resultado;
        try{
        resultado = numero / 0;
        System.out.println(resultado);
        }catch(ArithmeticException ex){
            System.out.println("Errores Matemáticos, como división por cero."+ ex.getMessage());
        }
        
    }
    

}
