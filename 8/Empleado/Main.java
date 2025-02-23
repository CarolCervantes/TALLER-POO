// Clase Empleado
class Empleado {
    String nombre;
    double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
    }
}

class Gerente extends Empleado {
    String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Luis", 2500.00);
        Gerente gerente = new Gerente("María", 5000.00, "TI");

        System.out.println("Información del Empleado:");
        empleado.mostrarDetalles();

        System.out.println("\nInformación del Gerente:");
        gerente.mostrarDetalles();
    }
}
