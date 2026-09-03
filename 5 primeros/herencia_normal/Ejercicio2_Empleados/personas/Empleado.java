package personas;

/**
 * Clase base para el calculo de pagos de personal.
 */
public class Empleado {

    protected String nombreCompleto;
    protected double salarioBase;

    public Empleado(String nombreCompleto, double salarioBase) {
        this.nombreCompleto = nombreCompleto;
        this.salarioBase = salarioBase;
    }

    public double calcularPago() {
        return salarioBase;
    }

    public String obtenerNombre() {
        return nombreCompleto;
    }
}
