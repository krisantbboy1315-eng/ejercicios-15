package hospital;
// Java no permite heredar de Medico y Residente. Se hereda de Medico y se agregan datos de residencia.
public class MedicoResidenteInvestigador extends Medico {
    private int guardias;
    public MedicoResidenteInvestigador(String nombre, int horasExtra, int guardias) { super(nombre, horasExtra); this.guardias=guardias; }
    @Override public double calcularSalario() { return super.calcularSalario() + guardias * 120000 + 400000; }
}
