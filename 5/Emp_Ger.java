class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }
}

class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);
    }
}

public class Emp_Ger {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Carlos", 3000);
        Gerente gerente = new Gerente("Laura", 5000, "TI");

        System.out.println("Información del Empleado:");
        empleado.mostrarInformacion();

        System.out.println("\nInformación del Gerente:");
        gerente.mostrarInformacion();
    }
}

