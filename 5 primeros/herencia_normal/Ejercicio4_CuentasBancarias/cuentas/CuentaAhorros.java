package cuentas;

public class CuentaAhorros extends CuentaBancaria {

    public CuentaAhorros(String numeroDeCuenta, double saldoActual) {
        super(numeroDeCuenta, saldoActual);
    }

    @Override
    public double calcularInteres() {
        return obtenerSaldo() * 0.05;
    }
}
