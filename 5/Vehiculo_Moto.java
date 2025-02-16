class Vehiculo {
    protected String tipo;
    protected String marca;

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }
}

class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarDetalles() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}

public class Vehiculo_Moto {
    public static void main(String[] args) {
        Moto moto = new Moto("Deportiva", "Yamaha", 600);
        moto.mostrarDetalles();

        // Intento de acceso desde una clase no relacionada
        // System.out.println(moto.tipo); // Error: tipo es protected
    }
}

