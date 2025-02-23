interface EjemploInterfaz {
    void metodoInterfaz();
}

// Clase concreta que intenta implementar la interfaz sin definir el método
class ClaseIncorrecta implements EjemploInterfaz {
    //Esto causará un error de compilación porque no implementa metodoInterfaz()
}
