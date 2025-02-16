class PruebaPrivate {
    private int datoPrivado = 10;
}

public class Private {
    public static void main(String[] args) {
        PruebaPrivate obj = new PruebaPrivate();
        // System.out.println(obj.datoPrivado); // Esto generará un error de compilación
    }
}

