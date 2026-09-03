import animales.Aguila;
import animales.Leon;
import animales.Pinguino;
import excepciones.EdadInvalidaError;
import zoo.Zoologico;

public class EjecutorAnimales {
    public static void main(String[] args) {
        try {
            Leon leon = new Leon("Simba", 5);
            Pinguino pinguino = new Pinguino("Pingui", 3);
            Aguila aguila = new Aguila("Aguila", 4);

            Zoologico recinto = new Zoologico();
            recinto.incorporarAnimal(leon, 0);
            recinto.incorporarAnimal(pinguino, 1);
            recinto.incorporarAnimal(aguila, 2);

            recinto.listarVoladores();

        } catch (EdadInvalidaError ex) {
            System.out.println("Error detectado: " + ex.getMessage());
        }
    }
}
