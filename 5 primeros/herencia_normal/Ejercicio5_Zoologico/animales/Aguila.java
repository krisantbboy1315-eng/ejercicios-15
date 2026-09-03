package animales;

import excepciones.EdadInvalidaError;

public class Aguila extends Animal implements Volador {

    public Aguila(String nombreAnimal, int edadAnimal) throws EdadInvalidaError {
        super(nombreAnimal, edadAnimal);
    }

    @Override
    public void emitirSonido() {
        System.out.println("El aguila emite un grito agudo.");
    }

    @Override
    public void realizarVuelo() {
        System.out.println("El aguila se eleva y planea en el aire.");
    }
}
