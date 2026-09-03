package animales;

import excepciones.EdadInvalidaError;

/**
 * Clase base de la jerarquia de animales del zoologico.
 */
public class Animal {

    protected String nombreAnimal;
    protected int edadAnimal;

    public Animal(String nombreAnimal, int edadAnimal) throws EdadInvalidaError {
        if (edadAnimal < 0) {
            throw new EdadInvalidaError("La edad ingresada no puede ser negativa");
        }
        this.nombreAnimal = nombreAnimal;
        this.edadAnimal = edadAnimal;
    }

    public void emitirSonido() {
        throw new UnsupportedOperationException(
                "emitirSonido() debe ser sobrescrito por las subclases");
    }

    public String obtenerNombre() {
        return nombreAnimal;
    }
}
