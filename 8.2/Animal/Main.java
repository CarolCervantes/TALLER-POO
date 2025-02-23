class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}

class Pez extends Animal {
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie); 
        this.tipoDeAgua = tipoDeAgua;
    }

    public void mostrarDetalles() {
        super.mostrarEspecie(); 
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}

public class Main {
    public static void main(String[] args) {
        Pez pez1 = new Pez("Salmón", "Agua dulce");
        pez1.mostrarDetalles();
    }
}
