class Animal {
    
    void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}


class Perro extends Animal {
    
    @Override
    void hacerSonido() {
        System.out.println("El perro ladra.");
    }

    
    void hacerSonido(String tipo) {
        System.out.println("El perro de raza " + tipo + " ladra.");
    }
}


public class AnimalTest {
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        Perro perro = new Perro();

        System.out.println("Prueba con Animal:");
        animal.hacerSonido();

        // Imprimir mensaje de prueba
        System.out.println("\nPrueba con Perro:");
        perro.hacerSonido();

       
        System.out.println("\nPrueba con Perro y raza:");
        perro.hacerSonido("Labrador");
    }
}
