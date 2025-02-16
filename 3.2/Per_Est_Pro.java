class Persona {
    void presentarse() {
        System.out.println("Hola, soy una persona.");
    }
}


class Estudiante extends Persona {
    @Override
    void presentarse() {
        System.out.println("Hola, soy un estudiante.");
    }
}

class Profesor extends Persona {
    @Override
    void presentarse() {
        System.out.println("Hola, soy un profesor.");
    }
}


public class Per_Est_Pro {
    public static void main(String[] args) {
        Persona[] personas = { new Persona(), new Estudiante(), new Profesor() };
        for (Persona persona : personas) {
            persona.presentarse();
        }
    }
}


