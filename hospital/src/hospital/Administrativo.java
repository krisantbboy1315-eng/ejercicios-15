package hospital;
public class Administrativo extends Empleado {
    public Administrativo(String nombre) { super(nombre, 2100000); }
    @Override public double calcularSalario() { return salarioBase; }
}
