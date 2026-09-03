package zoo;

import animales.Animal;
import animales.Volador;

public class Zoologico {

    private final Animal[] habitantes;

    public Zoologico() {
        this.habitantes = new Animal[10];
    }

    public void incorporarAnimal(Animal animal, int indice) {
        if (indice >= 0 && indice < habitantes.length) {
            habitantes[indice] = animal;
        }
    }

    public void listarVoladores() {
        System.out.println("===== ANIMALES CAPACES DE VOLAR =====");
        for (Animal animal : habitantes) {
            if (animal != null && animal instanceof Volador) {
                System.out.println("Animal: " + animal.getClass().getSimpleName());
                ((Volador) animal).realizarVuelo();
            }
        }
    }
}
