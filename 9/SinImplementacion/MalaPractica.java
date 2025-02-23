// Interfaz con un método sin implementación
interface SinImplementacion {
    void metodoSinImplementar();
}

// Clase que intenta implementar la interfaz sin definir el método
class ClaseInvalida implements SinImplementacion {
    // Esto causará un error de compilación porque no se implementa el método requerido
}

// Interfaz sin relación lógica con la clase
interface InterfaceInnecesaria {
    void metodoInnecesario();
}

// Clase que implementa una interfaz sin relevancia lógica
class Auto implements InterfaceInnecesaria {
    @Override
    public void metodoInnecesario() {
        System.out.println("Este método no tiene sentido en un Auto.");
    }
}

// Clase de prueba
public class MalaPractica {
    public static void main(String[] args) {
        // Esto generará un error de compilación
        // ClaseInvalida obj = new ClaseInvalida();

        Auto miAuto = new Auto();
        miAuto.metodoInnecesario(); // Se ejecuta, pero la lógica es incoherente
    }
}
