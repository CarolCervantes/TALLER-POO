abstract class Animal {
    abstract void hacerSonido();
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal(); // Error: No se puede instanciar una clase abstracta
    }
}
