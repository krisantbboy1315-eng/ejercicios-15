package cuentas;

public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(String numeroDeCuenta, double saldoActual) {
        super(numeroDeCuenta, saldoActual);
    }

    @Override
    public double calcularInteres() {
        return obtenerSaldo() * 0.02;
    }
}
