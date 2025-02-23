abstract class Figura {
    
    abstract double calcularArea();

    void mostrarArea() {
        System.out.println("El área es: " + calcularArea());
    }
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return base * altura;
    }
}


public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5); 
        Figura rectangulo = new Rectangulo(4, 6);  

        circulo.mostrarArea();
        rectangulo.mostrarArea();
    }
}
