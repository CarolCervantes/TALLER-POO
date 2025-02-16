public class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0;

    // Constructor
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    // Método estático para mostrar el número de coches creados
    public static void mostrarCantidadCoches() {
        System.out.println("Coches creados: " + contadorCoches);
    }
}

