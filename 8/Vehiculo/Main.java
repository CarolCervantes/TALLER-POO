class Vehiculo {
    String marca;
    int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}

class Coche extends Vehiculo {
    int numeroDePuertas;

    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de Puertas: " + numeroDePuertas);
    }
}

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota", 180);
        Coche coche = new Coche("Honda", 200, 4);

        System.out.println("Información del Vehículo:");
        vehiculo.mostrarInformacion();

        System.out.println("\nInformación del Coche:");
        coche.mostrarInformacion();
    }
}
