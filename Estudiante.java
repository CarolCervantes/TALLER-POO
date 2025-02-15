public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    public Estudiante() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.curso = "No asignado";
    }

    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    
    public String toString() {
        return "Estudiante{" +
               "Nombre='" + nombre + '\'' +
               ", Edad=" + edad +
               ", Curso='" + curso + '\'' +
               '}';
    }
}


