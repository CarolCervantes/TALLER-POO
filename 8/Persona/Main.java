class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
}

class Estudiante extends Persona {
    String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Matrícula: " + matricula);
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Ana", 20, "E12345");
        Estudiante estudiante2 = new Estudiante("Carlos", 22, "E67890");

        System.out.println("Información del Estudiante 1:");
        estudiante1.mostrarInformacion();

        System.out.println("\nInformación del Estudiante 2:");
        estudiante2.mostrarInformacion();
    }
}

