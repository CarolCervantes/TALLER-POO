class Matematicas {

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero");
            return 0;
        }
        return a / b;
    }
}


public class PruebaMatematicas {
    public static void main(String[] args) {
        System.out.println("Suma: " + Matematicas.suma(5, 3));
        System.out.println("Resta: " + Matematicas.resta(10, 4));
        System.out.println("Multiplicación: " + Matematicas.multiplicacion(6, 7));
        System.out.println("División: " + Matematicas.division(15, 3));
    }
}

