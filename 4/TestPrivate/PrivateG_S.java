class SinEncapsulamiento {
    private int valor = 100;

    // No hay métodos get ni set
}

public class PrivateG_S {
    public static void main(String[] args) {
        SinEncapsulamiento obj = new SinEncapsulamiento();
        // System.out.println(obj.valor); // Error de compilación
    }
}
