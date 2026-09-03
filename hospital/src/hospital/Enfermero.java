package hospital;
public class Enfermero extends Empleado {
    private boolean uci; private int horasNocturnas;
    public Enfermero(String nombre, boolean uci, int horasNocturnas) { super(nombre, 2400000); this.uci=uci; this.horasNocturnas=horasNocturnas; }
    @Override public double calcularSalario() { return uci ? salarioBase + horasNocturnas * 18000 : salarioBase; }
}
