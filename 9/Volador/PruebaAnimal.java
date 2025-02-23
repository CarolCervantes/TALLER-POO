interface Volador {
    void volar();
}

interface Nadador {
    void nadar();
}

class Animal implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El animal está volando.");
    }

    @Override
    public void nadar() {
        System.out.println("El animal está nadando.");
    }
}

public class PruebaAnimal {
    public static void main(String[] args) {
        Animal miAnimal = new Animal();
        
        miAnimal.volar();
        miAnimal.nadar();
    }
}

