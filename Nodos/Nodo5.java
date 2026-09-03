import java.util.ArrayList;
import java.util.List;

class ChunkNodeDinamico {
    private String nombreModulo;
    private List<Object> slotsMemoria;

    public ChunkNodeDinamico(String nombreModulo) {
        this.nombreModulo = nombreModulo;
        this.slotsMemoria = new ArrayList<>();
    }

    public void registrarRecurso(Object recurso) {
        slotsMemoria.add(recurso);
    }
}