package personas;

import nomina.GeneradoNomina;

public class Ejecutor {
    public static void main(String[] args) {

        EmpleadoTiempoCompleto emp1 = new EmpleadoTiempoCompleto("Mariana", 2000000);
        EmpleadoPorHoras emp2 = new EmpleadoPorHoras("Nataly", 15000, 2);
        EmpleadoTiempoCompleto emp3 = new EmpleadoTiempoCompleto("Yochua", 2000000);

        Empleado[] listaEmpleados = { emp1, emp2, emp3 };

        GeneradoNomina generador = new GeneradoNomina();
        double totalPagar = generador.calcularTotal(listaEmpleados);

        System.out.println("El total a pagar es de: " + totalPagar);
    }
}
