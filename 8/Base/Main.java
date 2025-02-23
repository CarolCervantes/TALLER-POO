class Base1 {
    public void metodoBase1() {
        System.out.println("Método de Base1");
    }
}

class Base2 {
    public void metodoBase2() {
        System.out.println("Método de Base2");
    }
}

class Incorrecto extends Base1 { //Java no permite herencia múltiple
    public void metodoIncorrecto() {
        System.out.println("Intento de herencia múltiple en Java");
    }
}

public class Main {
    public static void main(String[] args) {
        Incorrecto obj = new Incorrecto();
        obj.metodoBase1();
        obj.metodoIncorrecto();
        //Esto no se puede llamar porque Base2 no es parte de la jerarquía
    }
}
