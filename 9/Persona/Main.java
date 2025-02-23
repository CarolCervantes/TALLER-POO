interface Hablador {
    void hablar();
}

interface Trabajador {
    void trabajar();
}

class Persona implements Hablador, Trabajador {
    @Override
    public void hablar() {
        System.out.println("Hola, estoy hablando.");
    }

    @Override
    public void trabajar() {
        System.out.println("Estoy trabajando.");
    }
}

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.hablar();
        persona.trabajar();
    }
}
