import java.util.ArrayList;
import java.util.List;

class VerticeDinamico {
    private int id;
    private List<VerticeDinamico> vecinos; // Se expande conforme se agregan aristas

    public VerticeDinamico(int id) {
        this.id = id;
        this.vecinos = new ArrayList<>(); // Inicialmente vacío
    }

    public void agregarConexion(VerticeDinamico destino) {
        vecinos.add(destino); // Redimensiona internamente según haga falta
    }
}