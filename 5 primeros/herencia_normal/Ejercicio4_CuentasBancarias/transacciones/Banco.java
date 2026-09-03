package transacciones;

import cuentas.CuentaBancaria;
import cuentas.CuentaAhorros;
import cuentas.CuentaAhorroPremium;
import cuentas.CuentaCorriente;

public class Banco {

    private final CuentaBancaria[] listadoCuentas;

    public Banco() {
        this.listadoCuentas = new CuentaBancaria[10];
    }

    public void registrarCuenta(CuentaBancaria cuenta, int indice) {
        if (indice >= 0 && indice < listadoCuentas.length) {
            listadoCuentas[indice] = cuenta;
        }
    }

    public void procesarIntereses() {
        for (CuentaBancaria cuenta : listadoCuentas) {
            if (cuenta == null) continue;

            double interesAplicado = 0.0;

            if (cuenta instanceof CuentaAhorroPremium) {
                interesAplicado = cuenta.obtenerSaldo() * 0.08;
            } else if (cuenta instanceof CuentaAhorros) {
                interesAplicado = cuenta.obtenerSaldo() * 0.05;
            } else if (cuenta instanceof CuentaCorriente) {
                interesAplicado = cuenta.obtenerSaldo() * 0.02;
            }

            cuenta.actualizarSaldo(cuenta.obtenerSaldo() + interesAplicado);
        }
    }

    public void listarCuentas() {
        System.out.println("===== LISTADO DE CUENTAS =====");
        for (CuentaBancaria cuenta : listadoCuentas) {
            if (cuenta == null) continue;

            System.out.println("Numero de cuenta: " + cuenta.obtenerNumeroCuenta());
            System.out.println("Saldo actual: " + cuenta.obtenerSaldo());
            System.out.println("Interes calculado: " + cuenta.calcularInteres());
            System.out.println("----------");
        }
    }
}
