interface Volador {
    void volar();
}

interface Nadador {
    void nadar();
}

class Pato implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El pato está volando.");
    }

    @Override
    public void nadar() {
        System.out.println("El pato está nadando.");
    }
}

public class PruebaPato {
    public static void main(String[] args) {
        Pato pato = new Pato();

        pato.volar();
        pato.nadar();
    }
}
