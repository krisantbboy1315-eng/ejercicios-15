package animales;

import excepciones.EdadInvalidaError;

public class Pinguino extends Animal {

    public Pinguino(String nombreAnimal, int edadAnimal) throws EdadInvalidaError {
        super(nombreAnimal, edadAnimal);
    }

    @Override
    public void emitirSonido() {
        System.out.println("El pinguino emite su caracteristico sonido.");
    }
}
