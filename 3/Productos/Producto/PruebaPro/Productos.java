package Producto;
class Producto {
    String Nombre;
    double Precio;
    int Stock;

    Producto(String Nombre, double Precio, int Stock){
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Stock = Stock;
    }

    void mostrarInfo(){
        System.out.println("Nombre del producto: " + Nombre + "\n" + "Precio: " 
        + Precio + "\n" + "Cantidad disponible: " + Stock);
    }
}
