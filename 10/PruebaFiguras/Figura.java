abstract class Figura {
   
    abstract double calcularArea();
}

class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    double calcularArea() {
        return ancho * alto;
    }
}

class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }
}

public class PruebaFiguras {
    public static void main(String[] args) {
        
        Figura rectangulo = new Rectangulo(5, 10);
        Figura triangulo = new Triangulo(4, 8);

        System.out.println("Área del Rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del Triángulo: " + triangulo.calcularArea());
    }
}
