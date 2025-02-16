class Banco {
    private double saldo; 

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Cantidad inválida para depósito.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }
}

public class Protected_Eje {
    public static void main(String[] args) {
        Banco cuenta = new Banco(1000);
        cuenta.depositar(500);
        cuenta.retirar(200);
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}
/*Si se usa protected para saldo, cualquier subclase podría acceder y modificarlo 
sin restricciones, lo que no es seguro. Lo mejor es hacerlo private y usar métodos
como getSaldo(), depositar() y retirar() para asegurar de que solo se pueda cambiar
de forma controlada.*/