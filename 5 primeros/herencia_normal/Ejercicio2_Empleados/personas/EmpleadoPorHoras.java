package personas;

public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoPorHoras(String nombreCompleto, double tarifaHora, int horasTrabajadas) {
        super(nombreCompleto, 0);
        this.tarifaHora = tarifaHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularPago() {
        return tarifaHora * horasTrabajadas;
    }
}
