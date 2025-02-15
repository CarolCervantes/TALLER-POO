public class CuentaBancaria {
    private String numerocuenta;
    private double saldo;
    private String tipocuenta;

    public CuentaBancaria() {
        this.numerocuenta = "0000";
        this.saldo = 0;
        this.tipocuenta = "Desconocido";
    }

    public CuentaBancaria(String numerocuenta, String tipocuenta) {
        this.numerocuenta = numerocuenta;
        this.tipocuenta = tipocuenta;
        this.saldo = 0; 
    }

    public CuentaBancaria(String numerocuenta, double saldo, String tipocuenta) {
        this.numerocuenta = numerocuenta;
        this.saldo = saldo;
        this.tipocuenta = tipocuenta;
    }

  
    public String toString() {
        return "CuentaBancaria{Número de cuenta='" + numerocuenta + "', Tipo de cuenta='" + tipocuenta + "', Saldo=" + saldo + "}";
    }
    }
