public class Estudiante {
private String nombre;
private int edad;

public Estudiante(String nombre, int edad){
    this.nombre=nombre;
    this.edad=edad;
}

public Estudiante(){
    this("", 0);
}

public void mostrarEstudiante(){
    System.out.println("Nombre del estudiante:" + nombre);
    System.out.println("Edad:" + edad);
}

    
}
