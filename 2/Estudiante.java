public class Estudiante {
private String nombre;
private int edad;

public Estudiante(String nombre, int edad){
    this.nombre=nombre;
    this.edad=edad;
}

public Estudiante(){
    this("Desconocido", 20);
}

public void mostrarEstudiante(){
    System.out.println("Nombre del estudiante:" + nombre);
    System.out.println("Edad:" + edad);
}
public static void main (String[]args){
    Estudiante estudiante1= new Estudiante("Juan", 17);
    estudiante1.mostrarEstudiante();
}
    
}
