package nomina;

import personas.Empleado;

public class GeneradoNomina {

    public double calcularTotal(Empleado[] listaEmpleados) {
        double acumulado = 0.0;
        for (Empleado emp : listaEmpleados) {
            acumulado += emp.calcularPago();
        }
        return acumulado;
    }
}
