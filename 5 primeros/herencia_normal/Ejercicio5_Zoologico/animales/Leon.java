package animales;

import excepciones.EdadInvalidaError;

public class Leon extends Animal {

    public Leon(String nombreAnimal, int edadAnimal) throws EdadInvalidaError {
        super(nombreAnimal, edadAnimal);
    }

    @Override
    public void emitirSonido() {
        System.out.println("El leon emite un rugido potente.");
    }
}
