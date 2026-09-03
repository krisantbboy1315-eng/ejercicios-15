package hospital;
public class Residente extends Empleado {
    private int anio; private int guardias; private String especialidad;
    public Residente(String nombre, int anio, int guardias, String especialidad) { super(nombre, 2000000); this.anio=anio; this.guardias=guardias; this.especialidad=especialidad; }
    @Override public double calcularSalario() { return salarioBase + salarioBase * (anio * 0.08) + guardias * 120000; }
    public void cambiarEspecialidad(String nueva) { especialidad=nueva; System.out.println(nombre + " ahora esta en " + especialidad); }
}
