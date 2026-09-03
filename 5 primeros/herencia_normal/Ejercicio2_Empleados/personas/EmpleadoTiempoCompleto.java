package personas;

public class EmpleadoTiempoCompleto extends Empleado {

    private static final double BONIFICACION = 0.15;

    public EmpleadoTiempoCompleto(String nombreCompleto, double salarioBase) {
        super(nombreCompleto, salarioBase);
    }

    @Override
    public double calcularPago() {
        return salarioBase + (salarioBase * BONIFICACION);
    }
}
