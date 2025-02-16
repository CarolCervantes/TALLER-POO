

public class PruebaUtilidades {
    public static void main(String[] args) {
        System.out.println("Suma: " + Utilidades.suma(5, 3));
        System.out.println("Resta: " + Utilidades.resta(5, 3));
        System.out.println("Multiplicación: " + Utilidades.multiplicacion(5, 3));
        System.out.println("División: " + Utilidades.division(5, 3));
        System.out.println("División por cero: " + Utilidades.division(5, 0));
    }
}