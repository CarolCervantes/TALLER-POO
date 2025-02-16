class PruebaStatic {
    private int valor = 10; 

  
    public void metodoCorrecto() {
        System.out.println("Valor: " + valor);
    }

    
    public static void metodoEstatico() {
        PruebaStatic obj = new PruebaStatic(); // Crear una instancia
        System.out.println("Valor desde método estático: " + obj.valor);
    }
}


public class PruebaStaticCorr {
    public static void main(String[] args) {
        PruebaStatic.metodoEstatico(); 
    }
}

