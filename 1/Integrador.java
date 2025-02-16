import java.util.Scanner;

public class Integrador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese los datos del libro:");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Número de páginas: ");
        int numeroPaginas = scanner.nextInt();
        Libro libro = new Libro(titulo, autor, numeroPaginas);

        
        System.out.println("\nIngrese los datos de la cuenta bancaria:");
        System.out.print("Número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = scanner.nextDouble();
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);

        
        System.out.println("\nIngrese los datos del estudiante:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Curso: ");
        String curso = scanner.nextLine();
        Estudiante estudiante = new Estudiante();

        
        System.out.println("\n--- DETALLES INGRESADOS ---");
        System.out.println(libro);
        System.out.println(cuenta);
        System.out.println(estudiante);

    
    }
}
