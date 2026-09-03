package cuentas;

/**
 * Clase base de la jerarquia de cuentas.
 * Los campos de saldo y numero se mantienen privados.
 */
public class CuentaBancaria {

    private double saldoActual;
    private String numeroDeCuenta;

    public CuentaBancaria(String numeroDeCuenta, double saldoActual) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldoActual = saldoActual;
    }

    public double obtenerSaldo() {
        return saldoActual;
    }

    public void actualizarSaldo(double nuevoSaldo) {
        this.saldoActual = nuevoSaldo;
    }

    public String obtenerNumeroCuenta() {
        return numeroDeCuenta;
    }

    public void actualizarNumeroCuenta(String nuevoNumero) {
        this.numeroDeCuenta = nuevoNumero;
    }

    public double calcularInteres() {
        throw new UnsupportedOperationException(
                "calcularInteres() debe ser implementado por las subclases");
    }
}
