package 3;
class Persona {
    private String Nombre;
    int Edad;
    
    Persona(String Nombre, int Edad){
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    String getNombre(){
        return Nombre;
    }

    void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    void MostrarInfo(){
        System.out.print("Nombre de la persona: " + Nombre + "\n" + "Edad: " + Edad);
    } 
}