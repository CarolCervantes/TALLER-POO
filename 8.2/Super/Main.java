class ClaseIncorrecta {
    public void metodoIncorrecto() {
        //Error: No hay clase base de la cual heredar
        System.out.println("Esto generará un error de compilación.");
    }
}

class ClaseBase {
    private String atributoPrivado = "Secreto";

    public String obtenerAtributo() {
        return atributoPrivado;
    }
}

//Error: Intentar acceder a un atributo privado de la clase base con 'super'
class ClaseDerivada extends ClaseBase {
    public void mostrarAtributo() {
        //Error: atributoPrivado es privado
        System.out.println("No se puede acceder directamente a un atributo privado con 'super'.");
    }
}

public class Main {
    public static void main(String[] args) {
        ClaseIncorrecta obj1 = new ClaseIncorrecta();
        obj1.metodoIncorrecto(); 

        ClaseDerivada obj2 = new ClaseDerivada();
        obj2.mostrarAtributo(); 
    }
}

