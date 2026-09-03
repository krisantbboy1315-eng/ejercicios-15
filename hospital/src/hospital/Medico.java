package hospital;
public class Medico extends Empleado {
    protected int horasExtra;
    public Medico(String nombre, int horasExtra) { super(nombre, 5000000); this.horasExtra = horasExtra; }
    @Override public double calcularSalario() { return salarioBase + horasExtra * 45000; }
}
