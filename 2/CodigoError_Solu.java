//Intenta crear un método static que intente utilizar this y observa los errores de compilación.

public class CodigoError {
    private String marca ="Lexus";

    public static void mostrarMarca(){
        System.out.println("La marca del vehiculo es:" + this.marca);
    }
    
}

