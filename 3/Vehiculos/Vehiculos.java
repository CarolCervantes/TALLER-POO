package Vehiculos;

public class Vehiculos {
    protected String tipo;

    public Vehiculos(String tipo) {
        this.tipo = tipo;
    }

    protected void mostrarTipo() {
        System.out.println("Tipo de vehículo: " + tipo);
    }

    public static void main(String[] args) {
        Vehiculos vehiculo = new Vehiculos("Automóvil");
        vehiculo.mostrarTipo();
    }
}
    

