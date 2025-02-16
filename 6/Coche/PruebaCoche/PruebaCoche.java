public class PruebaCoche {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Honda", "Civic");
        Coche coche3 = new Coche("Ford", "Focus");

        Coche.mostrarCantidadCoches(); // Muestra la cantidad de coches creados
    }
}
