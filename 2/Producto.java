public class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;

    }
    public void mostrarProducto(){
        System.out.println("Nombre: "+nombre);
        System.err.println("Precio:" + precio);
    }
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 20000);
        producto1.mostrarProducto();
    }
}