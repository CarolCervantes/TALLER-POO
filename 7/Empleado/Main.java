abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    abstract double calcularSalario();

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + calcularSalario());
    }
}

class Gerente extends Empleado {
    private double bonoGerencial;

    public Gerente(String nombre, double salarioBase, double bonoGerencial) {
        super(nombre, salarioBase);
        this.bonoGerencial = bonoGerencial;
    }

    @Override
    double calcularSalario() {
        return salarioBase + bonoGerencial;
    }
}

class Vendedor extends Empleado {
    private double comision;
    private int ventasRealizadas;

    public Vendedor(String nombre, double salarioBase, double comision, int ventasRealizadas) {
        super(nombre, salarioBase);
        this.comision = comision;
        this.ventasRealizadas = ventasRealizadas;
    }

    @Override
    double calcularSalario() {
        return salarioBase + (comision * ventasRealizadas);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Empleado gerente = new Gerente("Carlos", 3000, 1000);
        Empleado vendedor = new Vendedor("Ana", 1500, 200, 5);

        gerente.mostrarDetalles();
        System.out.println();
        vendedor.mostrarDetalles();
    }
}

