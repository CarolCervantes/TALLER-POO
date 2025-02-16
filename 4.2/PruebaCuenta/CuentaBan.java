
public class CuentaBan {
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta; 

    
    public CuentaBan(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

   
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }
    
public class PruebaCuenta {
    public static void main(String[] args) {
        CuentaBan cuenta = new CuentaBan("12345678", 5000, "Ahorros");
        cuenta.mostrarDetalles();

      
    }
}


}