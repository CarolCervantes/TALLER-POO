abstract class Animal {
    void dormir() {
        System.out.println("El animal está durmiendo");
    }
}

class Perro extends Animal {
    @Override
    void dormir() {
        System.out.println("El perro duerme en su cama");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Animal miPerro = new Perro();
        miPerro.dormir(); // Salida: El perro duerme en su cama
    }
}
