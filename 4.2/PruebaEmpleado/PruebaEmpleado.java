
public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Carlos", 2500);
        System.out.println("Nombre: " + empleado1.nombre);
        System.out.println("Salario: " + empleado1.getSalario());

        empleado1.setSalario(-1000); 
        System.out.println("Salario actualizado: " + empleado1.getSalario());
    }
}