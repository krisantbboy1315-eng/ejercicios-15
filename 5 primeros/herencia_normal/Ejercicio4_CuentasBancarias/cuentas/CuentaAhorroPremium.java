package cuentas;

public class CuentaAhorroPremium extends CuentaAhorros {

    public CuentaAhorroPremium(String numeroDeCuenta, double saldoActual) {
        super(numeroDeCuenta, saldoActual);
    }

    @Override
    public double calcularInteres() {
        return obtenerSaldo() * 0.08;
    }
}
