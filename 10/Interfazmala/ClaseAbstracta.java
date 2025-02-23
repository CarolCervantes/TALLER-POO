abstract class ClaseAbstracta {
    abstract void metodoAbstracto();

    void metodoConcreto() {
        System.out.println("Este es un método con implementación en una clase abstracta.");
    }
}

class ClaseHija extends ClaseAbstracta {
    @Override
    void metodoAbstracto() {
        System.out.println("Implementación del método abstracto.");
    }
}

