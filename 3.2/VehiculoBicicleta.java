class Vehiculo {
    public Vehiculo() {
        
    }

    void moverse() {
        System.out.println("El vehículo se está moviendo.");
    }
}

class Bicicleta extends Vehiculo {
    @Override
    void moverse() {
        System.out.println("La bicicleta se mueve pedaleando.");
    }
}

public class VehiculoBicicleta {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Bicicleta bicicleta = new Bicicleta();
        
        System.out.println("Prueba con Vehículo:");
        vehiculo.moverse();
        
        System.out.println("\nPrueba con Bicicleta:");
        bicicleta.moverse();
    }
}
