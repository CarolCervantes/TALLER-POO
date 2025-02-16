    class Coche {
        private String marca;
        private String modelo;
        private int velocidadMaxima;
    
        // Constructor
        public Coche(String marca, String modelo, int velocidadMaxima) {
            this.marca = marca;
            this.modelo = modelo;
            this.velocidadMaxima = velocidadMaxima;
        }
    
        // Métodos get
        public String getMarca() {
            return marca;
        }
    
        public String getModelo() {
            return modelo;
        }
    
        public int getVelocidadMaxima() {
            return velocidadMaxima;
        }
    
        // Método acelerar
        public void acelerar(int incremento) {
            if (incremento > 0) {
                velocidadMaxima += incremento;
            } else {
                System.out.println("El incremento debe ser positivo.");
            }
        }
    }
    
    public class TestCoche {
        public static void main(String[] args) {
            Coche miCoche = new Coche("Toyota", "Supra", 250);
            System.out.println("Marca: " + miCoche.getMarca());
            System.out.println("Modelo: " + miCoche.getModelo());
            System.out.println("Velocidad Máxima: " + miCoche.getVelocidadMaxima());
    
            // Intentamos acelerar con un valor válido e inválido
            miCoche.acelerar(20);
            System.out.println("Nueva Velocidad Máxima: " + miCoche.getVelocidadMaxima());
    
            miCoche.acelerar(-10); // Esto debería mostrar un mensaje de error
        }
    }
    

