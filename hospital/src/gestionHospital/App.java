package gestionHospital;
import hospital.*;
public class App {
    public static void main(String[] args) {
        Empleado medico = new Medico("Dr. Juan", 5); Empleado enfermeroUci = new Enfermero("Ana", true, 20);
        Empleado enfermeroNormal = new Enfermero("Pedro", false, 20); Residente residente = new Residente("Laura", 2, 3, "Pediatria");
        Empleado administrativo = new Administrativo("Marta"); Empleado investigador = new MedicoResidenteInvestigador("Dr. Carlos", 4, 2);
        medico.mostrar(); enfermeroUci.mostrar(); enfermeroNormal.mostrar(); residente.mostrar(); administrativo.mostrar(); investigador.mostrar();
        residente.cambiarEspecialidad("Urgencias"); residente.mostrar();
    }
}
